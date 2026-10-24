public class Main {
    public static void main(String[] args) {
        String[] registros = {
            "balance: $50000000",
            "ingresos: $30000000",
            "egresos: $100000"
        };

        ExportadorFinanciero exportador;
        exportador = new ExportadorBancoCentral();
        exportador.exportarDatos(registros);

        System.out.println("-------------------");

        exportador = new ExportadorAgenciaTributaria();
        exportador.exportarDatos(registros);

        System.out.println("-----------------");

        String[] registroVacio = new String[0];
        exportador = new ExportadorBancoCentral();
        exportador.exportarDatos(registroVacio);
    }
}