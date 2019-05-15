package aspectos;

public aspect ConsultaBD {
	String consulta = "se realizo una consulta la base de datos";

	
	pointcut metodo() : 
					 call(	public * obtenerTodas*(..)) ||
							 call(	public * obtenerPorId*(..));
	

	

	// advice
	after() : metodo(){
		System.out.println(consulta);
	}
}
