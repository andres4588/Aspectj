package aspectos;

public aspect Eliminar {
String consulta = "se elimino una categoria";

	
	pointcut metodo() : 
	 call(public * eliminar*(..));
	

	

	// advice
	after() : metodo(){
		System.out.println(consulta);
	}
}
