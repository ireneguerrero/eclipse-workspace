package clases;

import java.util.Arrays;

import enums.EstadoMaterial;
import enums.Resoluciones;
import enums.TipoCable;

public class Monitor extends Perifericos{
	private float pulgadas;
	private Resoluciones resolucionMaxima;
	private TipoCable[] entradasVideo;

	public Monitor(String modelo, String marca, byte añosGarantia, boolean reestreno, EstadoMaterial estado,
			float pulgadas, Resoluciones resolucionMaxima, TipoCable[] entradasVideo) {
		super(modelo, marca, añosGarantia, reestreno, estado);
		this.pulgadas = pulgadas;
		this.resolucionMaxima = resolucionMaxima;
		this.setEntradasVideo (entradasVideo);
	}

	public float getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(float pulgadas) {
		this.pulgadas = pulgadas;
	}

	public Resoluciones getResolucionMaxima() {
		return resolucionMaxima;
	}

	public void setResolucionMaxima(Resoluciones resolucionMaxima) {
		this.resolucionMaxima = resolucionMaxima;
	}

	public TipoCable[] getEntradasVideo() {
		return entradasVideo;
	}

	public void setEntradasVideo(TipoCable[] entradasVideo) {
		this.entradasVideo = new TipoCable[entradasVideo.length];
		for (byte i = 0; i < entradasVideo.length; i++)
			if (entradasVideo[i].equals(TipoCable.HDMI)) {
				this.entradasVideo[i] = TipoCable.HDMI;
			} else if (entradasVideo[i].equals(TipoCable.DVI)) {
				this.entradasVideo[i] = TipoCable.DVI;
			} else if (entradasVideo[i].equals(TipoCable.VGA)) {
				this.entradasVideo[i] = TipoCable.VGA;
			} else if (!entradasVideo[i].equals(TipoCable.HDMI) && !entradasVideo[i].equals(TipoCable.DVI)
					&& !entradasVideo[i].equals(TipoCable.VGA)) {
				this.entradasVideo = null;
				System.out.println("Solo puede ser HDMI, DVI o VGA");
				break;
			}
	}

	@Override
	public String toString() {
		String mensaje = "Solo puede ser HDMI, DVI o VGA";
		return super.toString() + "\nMonitor pulgadas: " + pulgadas + "\nResolucion Maxima: " + resolucionMaxima
				+ "\nEntradas Video: " + (this.entradasVideo == null ? mensaje : Arrays.toString(this.entradasVideo) + "\n");
	}
	

}
