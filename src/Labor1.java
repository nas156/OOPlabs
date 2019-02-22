class Labor1
{
    public static void main(String[] args) {
        final int c = 0;
        final char a=2,b=2;
        final int m=10,n=11;
        double s=0;
        if(c>=a && c<=n)
            System.out.println("Виникає ділення на 0");
        else{
            for (int i = a; i <=n; i++) {
                for (int j = b; j <=m ; j++) {
                    s+=(double)(j*i)/(i+c);
                }
            }
            System.out.println("Результат: "+s);
        }
    }
}

