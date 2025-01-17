﻿using Chat_server;
using Chat_Server.Net.IO;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;

namespace Chat_Server
{
    class Client
    {
        public String Username { get; set; }
        public Guid UID { get; set; }
        public TcpClient ClientSocket { get; set; }
        PacketReader _packetReader;
        public Client(TcpClient client)
        {
            ClientSocket = client;
            UID = Guid.NewGuid();
            _packetReader = new(ClientSocket.GetStream());
            var opcode = _packetReader.ReadByte();
            Username = _packetReader.ReadMessage();
            Console.WriteLine($"{DateTime.Now} Username: {Username} has connected");
            string path = AppDomain.CurrentDomain.BaseDirectory + "LogFile.txt";
            File.AppendAllText(path, $"{DateTime.Now} {Username}: Connected" + Environment.NewLine);

            Task.Run(() => Process());
        }
        void Process()
        {
            while (true)
            {
                try
                {
                    var opcode = _packetReader.ReadByte();
                    switch (opcode)
                    {
                        case 5:
                            var msg = _packetReader.ReadMessage();
                            Console.WriteLine($"{DateTime.Now}, message received by {Username}: {msg}");
                            Program.BroadcastMessage($"{DateTime.Now}: {Username}: {msg}");
                            string path = AppDomain.CurrentDomain.BaseDirectory + "LogFile.txt";
                            File.AppendAllText(path, DateTime.Now.ToString() + " " + $"{Username}: " + " " + msg + Environment.NewLine);
                            break;
                        default:
                            break;
                    }
                }
                catch (Exception)
                {
                    Console.WriteLine($"{UID.ToString()}: Disconnected");
                    string path = AppDomain.CurrentDomain.BaseDirectory + "LogFile.txt";
                    File.AppendAllText(path, DateTime.Now.ToString() + " " + $"{Username}: " + " Disconnected " + Environment.NewLine);
                    Program.BroadcastDisconnect(UID.ToString());
                    ClientSocket.Close();
                    break;
                }
            }
        }
    }
}
