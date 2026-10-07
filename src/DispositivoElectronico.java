public class DispositivoElectronico
{
    protected String modelo;
    protected String fabricante;
    protected double consumoEnergia;
    protected boolean encendido;

    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia)
    {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        encendido = false;
    }

    public void encender()
    {
        encendido = true;
        System.out.println("El dispositivo " + modelo + " esta encendido");
    }

    public void apagar()
    {
        encendido = false;
        System.out.println("El dispositivo " + modelo + " esta apagado");
    }

    public String obtenerEstado()
    {
        if(encendido == true)
        {
            return "Modelo: " + modelo + ", Fabricante: " + fabricante +
                    ", Consumo: " + consumoEnergia + "W, Estado: Encendido";
        }
        else
        {
            return "Modelo: " + modelo + ", Fabricante: " + fabricante +
                    ", Consumo: " + consumoEnergia + "W, Estado: Apagado";
        }
    }
}