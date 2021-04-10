package Utils;

public class Information {
    public static double SALARY_SUPERVISOR_TAX_PERCENTAGE = 15.5;
    public static double SALARY_COLABORADOR_TAX_PERCENTAGE = 12.5;
    public static double IMPUESTO_AL_CLIENTE=0.15;

    public static void MainHolidays(){
        System.out.println("Semana Santa");
        System.out.println("dia del trabajador");
        System.out.println("Navidad");
        System.out.println("Año nuevo");
    }

    public static void MainGerarquia(){
        System.out.println("GERENTES");
        System.out.println("SUPERVISORES");
        System.out.println("COLABORADORES");
        System.out.println("CLIENTES");
    }

    public static double CalcularImpuestoColaborador(double a){
        double impuesto= a*SALARY_COLABORADOR_TAX_PERCENTAGE/100;

        return impuesto;
    }
}
