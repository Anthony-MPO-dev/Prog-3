public enum Operacao{
    SOMA{
        public int avalia(int arg1, int arg2){
            return arg1 + arg2;
        }
    },
    SUBTRAI{
        public int avalia(int arg1, int arg2){
            return arg1 - arg2;
        }
    },
    MULTIPLICA{
        public int avalia(int arg1, int arg2){
            return arg1 * arg2;
        }
    },
    DIVIDE{
        public int avalia(int arg1, int arg2){
            return arg1 / arg2;
        }
    };

    public abstract int avalia(int arg1, int arg2);
}