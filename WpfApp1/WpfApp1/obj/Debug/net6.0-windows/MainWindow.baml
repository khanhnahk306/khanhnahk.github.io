   M S B A M L   `   `   `  ����B  >WpfApp1, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:WpfApp1WpfApp1  5   	       WpfApp1.MainWindow   5   	   W SPresentationCore, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:WpfApp1     5   	     � Title$
  Chat��5   	   $	��400��6   $	��800��6#   .��5	      �  � ColumnDefinitions 5
   
   �� 5      $��0* �6   �� 5       � RowDefinitions 5   
   �� 5      �� 5      $��0* �6   .+�5   
   �� -   5        $��tb_ipAddress��5      $
��Left=�6&   $	��Top=�6A   $��30��6Y   $	��150��6e   $��	80 10 0 0q�6q   $��1��6�   6�   �� 5   
   -   5        $��lb_ipAddress��5      $��
IP Address��6$   $
��Left=�69   $	��Top=�6T   $��30��6l   $��70��6x   $��	10 10 0 0q�6�   $��2��6�   6�   �� 5   
   -   5        $��lb_port��5      $
��Port��6   $
��Left=�6.   $	��Top=�6I   $��30��6a   $��70��6m   $��
270 10 0 0q�6x   $��1��6�   6�   �� 5   
   -   5        $��tb_port��5      $
��Left=�6!   $	��Top=�6<   $��30��6T   $	��150��6`   $��
310 10 0 0q�6l   $��1��6�   6�   �� 5   
   -   5        $��tb_displayChatBox��5      $
��Left=�6+   $	��Top=�6F   $	��250��6^   $	��565��6k   $��	10 50 0 0q�6w    �� 
IsReadOnly$
 True��6�   " �� VerticalScrollBarVisibility$ Visible=�6�   $��2��6�   �� 5   
   -   5        $��btn_addFriend��5      $��
Add Friend��6&   $
��Left=�6;   $	��Top=�6V   $��30��6n   $��95��6z   $��
685 10 0 0q�6�   $��1��6�   6�   �� 5   
   -   5        $��lb_displayFriend��5      $��Friend��6(   $
��Left=�69   $	��Top=�6T   $��30��6l   $��95��6x   $��
580 10 0 0q�6�   $��1��6�   6�   �� 5   
   -   5        $��tb_displayFriendBox��5      $
��Left=�6-   $	��Top=�6H   $	��250��6`   $	��200��6m   $��
580 50 0 0q�6y   $ Visible=�6�   $��1��6�   �� 5   
   -	   5        $��
lb_message��5      $��Message��6"   $
��Left=�64   $	��Top=�6O   $��30��6g   $��70��6s   $��
10 320 0 0q�6~   $��2��6�   6�   �� 5   
   -
   5        $��tb_enterMessage��5      $
��Left=�6)   $	��Top=�6D   $��30��6\   $	��485��6h   $��
90 320 0 0q�6t   $��1��6�   6�   �� 5   
   -   5        $��btn_sendMessage��5      $
��Send��6(   $
��Left=�67   $	��Top=�6R   $��30��6j   $��95��6v   $��580 320 0 0q�6�   $��1��6�   6�   �� 5   
   -   5        $��btn_startLogging��5      $��Start Logging��6)   $
��Left=�6A   $	��Top=�6\   $��30��6t   $��95��6�   $��685 320 0 0q�6�   $��1��6�   6�   5      5      