package EP2AED.pilha1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import EP2AED.pilha1.PilhaIngenua2;

public class processa {
	
	 public void carrega(File folder){

		    File[] fileNames = folder.listFiles();


		        if(folder.isDirectory()){
		           for(File file : fileNames){
		                try {
		                makeLog(file);
		                } catch (IOException e){
		                  e.printStackTrace();
		                }
		            } 
		        } else {
		            System.out.println("argumento deve ser uma pasta");
		        }
		    }
	 
	 public void makeLog(File file) throws IOException{

		 	PilhaIngenua2 pilha1 = new PilhaIngenua2();
//		 	ArranjoCap pilha2 = new ArranjoCap();
		 
			List<String> list = new ArrayList<>();   
	        List<Integer> saida = new ArrayList<>();
	
	        long start,end; 
	        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	
	            //br returns as stream and convert it into a List
	            list = br.lines().collect(Collectors.toList());
	            br.close();
	
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        
//	        System.out.println("------");
//	        System.out.println("read file " + file.getName());
//	        System.out.println("Tempo da pihla Ingenua: " + (end-start)/1000d);
//			System.out.println("write file " + file.getName().replace(".txt","Log.txt"));
			
	        
	        start = System.currentTimeMillis();
	        ProcessaPilhaIngenua2(list, saida, pilha1);
	        end = System.currentTimeMillis();
			
			
//	        start = System.currentTimeMillis();
//	        ProcessaArranjoCap(list, saida, pilha2);
//	        end = System.currentTimeMillis();
	        
//	        System.out.println(end-start);
//	        System.out.println("write file " + file.getName().replace(".txt","Log.txt"));
//	        System.out.println("tamanho saida " + saida.size());
	        
	        FileWriter writer = new FileWriter(file.getName().replace(".txt","-Log_pilhaIngenua.txt")); 
	        for(Integer str: saida) {
	          writer.write(str + System.lineSeparator());
	        }
	        
	        saida.clear();
	        list.clear();



	        }
	 

	 
	public void ProcessaPilhaIngenua2 (List<String> list, List<Integer> saida, PilhaIngenua2 pilha1) {
		list.forEach(s -> {   
				
			if(s.length() != 0){
				
				pilha1.add(Integer.parseInt(s));

			} else {
				
				saida.add(pilha1.remove());
			} 

		});
}
}
