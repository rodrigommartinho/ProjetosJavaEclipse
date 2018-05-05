public class Programa {

	public static void main(String[] args) {
		Filme filme = new Filme();
		filme.setCodigo(123);
		filme.setNome("A Ero do Gelo");
		filme.setValor(2.50);
		filme.setDisponivel(false);
		
		filme.mostra();
		
		Filme filme2 = new Filme();
		filme2.setCodigo(321);
		filme2.setNome("A Ero do Gelo 2");
		filme2.setValor(3.50);
		filme2.setDisponivel(true);
		
		filme2.mostra();
		
		try {
			filme.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			filme2.retirar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}