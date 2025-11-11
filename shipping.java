public class shipping {
    public static void main(String[] args) {
        int w=10;
        int d=100;

        int base_money=5;
        int cost_per_kg=2;
        double cost_per_km=0.05;

        double cost=base_money+w*cost_per_kg+d*cost_per_km;
        System.out.println((int)cost);
    }
}
