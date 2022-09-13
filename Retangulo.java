package listaPoo;

public class Retangulo {

	private Double altura, base;

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double areaRetangulo() {
		return base * altura;

	}

	public Double perimetro() {
		return (altura * 2) + (base * 2);

	}

	@Override
	public String toString() {
		return "Retangulo [altura=" + altura + ", base=" + base + 
				", Area="+ areaRetangulo() + 
				", Perimetro= "+ perimetro() +"]";
	}
	
	

}
