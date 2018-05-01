public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tecnico tecnicoA = new Tecnico();
		tecnicoA.setNome("Rubens Barichello");
		tecnicoA.setEspecialidade("Contra-ataque");
		
		Jogador jogadorA = new Jogador();
		jogadorA.setNome("Valter");
		jogadorA.setDataNascimento("10/02/1992");
		jogadorA.setPosicao("Atacante");
		
		Jogador jogadorAB = new Jogador();
		jogadorAB.setNome("Casagrande");
		jogadorAB.setDataNascimento("01/10/1970");
		jogadorAB.setPosicao("Atacante");
		
		Equipe equipeA = new Equipe();
		equipeA.setNome("Time A");
		equipeA.setCidade("Campinas");
		equipeA.setTecnico(tecnicoA);
		equipeA.setJogadores(new Jogador[2]);
		equipeA.adicionaJogador(jogadorA);
		equipeA.adicionaJogador(jogadorAB);
		
		/*-------------------------------------------------------------------*/
		Tecnico tecnicoB = new Tecnico();
		tecnicoB.setNome("Michael Schumacher");
		tecnicoB.setEspecialidade("Defesa");
		
		Jogador jogadorB = new Jogador();
		jogadorB.setNome("Vettel");
		jogadorB.setDataNascimento("01/01/1990");
		jogadorB.setPosicao("Volante");
		
		Equipe equipeB = new Equipe();
		equipeB.setNome("Time B");
		equipeB.setCidade("Campinas");
		equipeB.setTecnico(tecnicoB);
		equipeB.setJogadores(new Jogador[1]);
		equipeB.adicionaJogador(jogadorB);
		
		Partida partida = new Partida();
		partida.setData("06/01/2016");
		partida.setEstadio("Taquarão");
		//partida.setEquipe(equipeA);
		//partida.setEquipe(equipeB);
			
		/*-------------------------------------------------------------------*/
		System.out.println("Copa Paulista");
		System.out.println("Partida::" + partida.getEquipe(equipeA).getNome() + " x " + partida.getEquipe(equipeB).getNome());
		System.out.println("Estádio::" + partida.getEstadio());
		System.out.println("Data::" + partida.getData());
		System.out.println("----------------------------------------------------");
		
		System.out.println("Nome do Clube A::" + equipeA.getNome());
		System.out.println("Tecnico Clube A::" + equipeA.getTecnico().getNome());
		System.out.println("Especialidade Tecnico Clube A::" + equipeA.getTecnico().getEspecialidade());
		System.out.println("Destaque do Time A::" + jogadorA.getNome());
		System.out.println("Posição::" + jogadorA.getPosicao());
		System.out.println("Data de Nascimento::" + jogadorA.getDataNascimento());
		System.out.println("Escalação Time A::");
		for(Jogador jogador : equipeA.getJogadores()) {
			System.out.println(jogador.getNome() + " - " + jogador.getPosicao());
		}
		System.out.println("----------------------------------------------------");
		
		System.out.println("Nome do Clube B::" + equipeB.getNome());
		System.out.println("Tecnico Clube B::" + equipeB.getTecnico().getNome());
		System.out.println("Especialidade Tecnico Clube B::" + equipeB.getTecnico().getEspecialidade());
		System.out.println("Destaque do Time B::" + jogadorB.getNome());
		System.out.println("Posição::" + jogadorB.getPosicao());
		System.out.println("Data de Nascimento::" + jogadorB.getDataNascimento());
		System.out.println("Escalação Time B::");
		for(Jogador jogador : equipeB.getJogadores()) {
			System.out.println(jogador.getNome() + " - " + jogador.getPosicao());
		}
	}

}
