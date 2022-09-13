package Animal;

public class UsaCachorro {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("Mike");
		cachorro.setTipoMamifero("Quadrúpede");
		cachorro.setRaça("Golden Retriever");
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getTipoMamifero());
		System.out.println(cachorro.getRaça());

	}

}
