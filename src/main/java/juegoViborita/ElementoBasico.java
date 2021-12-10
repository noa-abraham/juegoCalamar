package juegoViborita;

import java.awt.Color;


public abstract class ElementoBasico implements Elemento {
	
	private int posicionX;
	private int posicionY;
	private int ancho;
	private int largo;
	private Color color;
	
	public ElementoBasico (int posicionX, int posicionY, int ancho, int largo, Color color) {
		this.posicionX = posicionX;
		this.posicionY = posicionY; 
		this.ancho = ancho;
		this.largo = largo;
		this.color = color;
	}
	

	public int getPosicionY() {
		return  posicionY;
	}
	
	public int getPosicionX() {
		return posicionX;  
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public int getAncho() {
		return ancho;
	}

	public int getLargo() {
		return largo;
	}

	public Color getColor() {
		return color;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public void setColor(Color color) {
		this.color = color;
	}



}
