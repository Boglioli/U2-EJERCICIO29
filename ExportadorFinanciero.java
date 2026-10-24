public abstract class ExportadorFinanciero {
    public boolean validar(String[] registro) {
        return registro != null && registro.length > 0;
    }

    public abstract void exportarDatos(String[] registro);
}
