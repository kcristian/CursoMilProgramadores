package Curso_Java;
import java.io.*;

public class pruebas_bais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buffer= {0,1,2,3,4,5,6,7,8,9};
		
		try {
			ByteArrayInputStream flujo_bytes=new ByteArrayInputStream(buffer);
			//int numero=flujo_bytes.available();
			boolean final_buffer=false;
			while(!final_buffer) {
				
				System.out.println("valor:"+flujo_bytes.available());
				int byte_lectura=flujo_bytes.read();
				
				if(byte_lectura!=-1) {
					System.out.println(byte_lectura);
				}else {
					final_buffer=true;
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}
