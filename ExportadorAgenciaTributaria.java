public class ExportadorAgenciaTributaria extends ExportadorFinanciero {
    public void exportarDatos(String[] registro) {
        if (validar(registro)) {
            System.out.println("exportando a la agencia tributaria");
            System.out.println("datos transferidos correctamente");
        } else {
            System.out.println("no hay registro para exportar");
        }
    }
}
