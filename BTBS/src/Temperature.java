public class Temperature {
    public static float CtoF(float c){
        return (9/5) * c + 32;
    }

    public static float FtoC(float f){
        return (f - 32)/ (9/5);
    }
}
