package ClasesTPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Spliterator;
import java.util.stream.Stream;


public class Principal {

	public static void main(String[] args) {
		String rutaArchivoResultado  = "carpetaresultado\\resultados.csv";     // en distintas carpetas como SE PEDIA.
		String rutaArchivoPronostico = "carpetapronostico\\pronosticos.csv";   // en distintas carpetas como SE PEDIA.

		HashMap<String, Integer> participan = new HashMap<String, Integer>();   // guarda los nombres de los participantes y sus respectivos puntajes
		
		
		// Guardo datos de RESULTADO - deberia ser una clase
  		try {
  			// leo archivo RESULTADO
  			List<String> listaResultado  = Files.readAllLines(Paths.get(rutaArchivoResultado));
  			
  			// leo archivo PRONOSTICO
  			List<String> listaPronostico = Files.readAllLines(Paths.get(rutaArchivoPronostico));
  			
  			//Muestro cada renglon del archivo RESULTADO	
			ArrayList<String> archivoResultado = new ArrayList<>(listaResultado);
			for (int i = 0; i < archivoResultado.size(); i++) {
				System.out.println(archivoResultado.get(i));
		 	}
			
			
			//Muestro cada renglon del archivo RESULTADO
			ArrayList<String> archivoPronostico = new ArrayList<>(listaPronostico);
			for (int i = 0; i < archivoPronostico.size(); i++) {
				System.out.println(archivoPronostico.get(i));
								
				// aqui guardo los nombre de los participantes en el HashMap "participan"
				String[] nombre = listaPronostico.get(i).split(",");
				if(i > 0) { 
					if (!participan.containsKey(nombre[0])) {    // pregunta sin NO EXISTE el nombre ya en el HashMap
						participan.put(nombre[0], 0);     //graba en el HashMap
					}
				}
			}

			
			
			///////// HASTA ACA ESTARIA PREPARADO PARA SER DINAMICO - al final voy poniendo en el HashMap DE FORMA DINAMICA los puntos /////////////////////////
			
			System.out.println("\n");
			
			// RESULTADO
			String[] equipo0Resultado = listaResultado.get(0).split(","); // Cabezera
			String[] equipo1Resultado = listaResultado.get(1).split(","); // Argentina 1 2 ArabiaSaudita
			String[] equipo2Resultado = listaResultado.get(2).split(","); // Polonia 0 0 Mexico
			String[] equipo3Resultado = listaResultado.get(3).split(","); // Argentina 2 0 Mexico
			String[] equipo4Resultado = listaResultado.get(4).split(","); // Arabia Saudita 0 2 Polonia
			String[] equipo5Resultado = listaResultado.get(5).split(","); // Argentina 2 0 Polonia
			String[] equipo6Resultado = listaResultado.get(6).split(","); // Arabia Saudita 1 2 Mexico
			
			// PRONOSTICO
			String[] equipo0Pronostico = listaPronostico.get(0).split(",");
			
			String[] equipo1Pronostico = listaPronostico.get(1).split(",");
			String[] equipo2Pronostico = listaPronostico.get(2).split(",");
			String[] equipo3Pronostico = listaPronostico.get(3).split(",");
			String[] equipo4Pronostico = listaPronostico.get(4).split(",");
			String[] equipo5Pronostico = listaPronostico.get(5).split(",");
			String[] equipo6Pronostico = listaPronostico.get(6).split(",");
			
			String[] equipo7Pronostico = listaPronostico.get(7).split(",");
			String[] equipo8Pronostico = listaPronostico.get(8).split(",");
			String[] equipo9Pronostico = listaPronostico.get(9).split(",");
			String[] equipo10Pronostico = listaPronostico.get(10).split(",");
			String[] equipo11Pronostico = listaPronostico.get(11).split(",");
			String[] equipo12Pronostico = listaPronostico.get(12).split(",");
			
			String[] equipo13Pronostico = listaPronostico.get(13).split(",");
			String[] equipo14Pronostico = listaPronostico.get(14).split(",");
			String[] equipo15Pronostico = listaPronostico.get(15).split(",");
			String[] equipo16Pronostico = listaPronostico.get(16).split(",");
			String[] equipo17Pronostico = listaPronostico.get(17).split(",");
			String[] equipo18Pronostico = listaPronostico.get(18).split(",");
			

			// paso los parametros a la clase Partido
			Partido resultadoPartido1 = new Partido(Integer.parseInt(equipo1Resultado[0]), Integer.parseInt(equipo1Resultado[1]), equipo1Resultado[2], equipo1Resultado[5], Integer.parseInt(equipo1Resultado[3]), Integer.parseInt(equipo1Resultado[4]));
			Partido resultadoPartido2 = new Partido(Integer.parseInt(equipo2Resultado[0]), Integer.parseInt(equipo2Resultado[1]), equipo2Resultado[2], equipo2Resultado[5], Integer.parseInt(equipo2Resultado[3]), Integer.parseInt(equipo2Resultado[4]));
			Partido resultadoPartido3 = new Partido(Integer.parseInt(equipo3Resultado[0]), Integer.parseInt(equipo3Resultado[1]), equipo3Resultado[2], equipo3Resultado[5], Integer.parseInt(equipo3Resultado[3]), Integer.parseInt(equipo3Resultado[4]));
			Partido resultadoPartido4 = new Partido(Integer.parseInt(equipo4Resultado[0]), Integer.parseInt(equipo4Resultado[1]), equipo4Resultado[2], equipo4Resultado[5], Integer.parseInt(equipo4Resultado[3]), Integer.parseInt(equipo4Resultado[4]));
			Partido resultadoPartido5 = new Partido(Integer.parseInt(equipo5Resultado[0]), Integer.parseInt(equipo5Resultado[1]), equipo5Resultado[2], equipo5Resultado[5], Integer.parseInt(equipo5Resultado[3]), Integer.parseInt(equipo5Resultado[4]));
			Partido resultadoPartido6 = new Partido(Integer.parseInt(equipo6Resultado[0]), Integer.parseInt(equipo6Resultado[1]), equipo6Resultado[2], equipo6Resultado[5], Integer.parseInt(equipo6Resultado[3]), Integer.parseInt(equipo6Resultado[4]));
			
			
			// paso los parametros a la clase Pronostico
			Pronostico pronosticoPartido1 = new Pronostico(equipo1Pronostico[0], Integer.parseInt(equipo1Pronostico[1]), Integer.parseInt(equipo1Pronostico[2]), equipo1Pronostico[3], equipo1Pronostico[4], equipo1Pronostico[5], equipo1Pronostico[6], equipo1Pronostico[7]);
			Pronostico pronosticoPartido2 = new Pronostico(equipo2Pronostico[0], Integer.parseInt(equipo2Pronostico[1]), Integer.parseInt(equipo2Pronostico[2]), equipo2Pronostico[3], equipo2Pronostico[4], equipo2Pronostico[5], equipo2Pronostico[6], equipo2Pronostico[7]);
			Pronostico pronosticoPartido3 = new Pronostico(equipo3Pronostico[0], Integer.parseInt(equipo3Pronostico[1]), Integer.parseInt(equipo3Pronostico[2]), equipo3Pronostico[3], equipo3Pronostico[4], equipo3Pronostico[5], equipo3Pronostico[6], equipo3Pronostico[7]);
			Pronostico pronosticoPartido4 = new Pronostico(equipo4Pronostico[0], Integer.parseInt(equipo4Pronostico[1]), Integer.parseInt(equipo4Pronostico[2]), equipo4Pronostico[3], equipo4Pronostico[4], equipo4Pronostico[5], equipo4Pronostico[6], equipo4Pronostico[7]);
			Pronostico pronosticoPartido5 = new Pronostico(equipo5Pronostico[0], Integer.parseInt(equipo5Pronostico[1]), Integer.parseInt(equipo5Pronostico[2]), equipo5Pronostico[3], equipo5Pronostico[4], equipo5Pronostico[5], equipo5Pronostico[6], equipo5Pronostico[7]);
			Pronostico pronosticoPartido6 = new Pronostico(equipo6Pronostico[0], Integer.parseInt(equipo6Pronostico[1]), Integer.parseInt(equipo6Pronostico[2]), equipo6Pronostico[3], equipo6Pronostico[4], equipo6Pronostico[5], equipo6Pronostico[6], equipo6Pronostico[7]);
			
			Pronostico pronosticoPartido7 = new Pronostico(equipo7Pronostico[0], Integer.parseInt(equipo7Pronostico[1]), Integer.parseInt(equipo7Pronostico[2]), equipo7Pronostico[3], equipo7Pronostico[4], equipo7Pronostico[5], equipo7Pronostico[6], equipo7Pronostico[7]);
			Pronostico pronosticoPartido8 = new Pronostico(equipo8Pronostico[0], Integer.parseInt(equipo8Pronostico[1]), Integer.parseInt(equipo8Pronostico[2]), equipo8Pronostico[3], equipo8Pronostico[4], equipo8Pronostico[5], equipo8Pronostico[6], equipo8Pronostico[7]);
			Pronostico pronosticoPartido9 = new Pronostico(equipo9Pronostico[0], Integer.parseInt(equipo9Pronostico[1]), Integer.parseInt(equipo9Pronostico[2]), equipo9Pronostico[3], equipo9Pronostico[4], equipo9Pronostico[5], equipo3Pronostico[6], equipo3Pronostico[7]);
			Pronostico pronosticoPartido10 = new Pronostico(equipo10Pronostico[0], Integer.parseInt(equipo10Pronostico[1]), Integer.parseInt(equipo10Pronostico[2]), equipo10Pronostico[3], equipo10Pronostico[4], equipo10Pronostico[5], equipo10Pronostico[6], equipo10Pronostico[7]);
			Pronostico pronosticoPartido11 = new Pronostico(equipo11Pronostico[0], Integer.parseInt(equipo11Pronostico[1]), Integer.parseInt(equipo11Pronostico[2]), equipo11Pronostico[3], equipo11Pronostico[4], equipo11Pronostico[5], equipo11Pronostico[6], equipo11Pronostico[7]);
			Pronostico pronosticoPartido12 = new Pronostico(equipo12Pronostico[0], Integer.parseInt(equipo12Pronostico[1]), Integer.parseInt(equipo12Pronostico[2]), equipo12Pronostico[3], equipo12Pronostico[4], equipo12Pronostico[5], equipo12Pronostico[6], equipo12Pronostico[7]);
			
			Pronostico pronosticoPartido13 = new Pronostico(equipo13Pronostico[0], Integer.parseInt(equipo13Pronostico[1]), Integer.parseInt(equipo13Pronostico[2]), equipo13Pronostico[3], equipo13Pronostico[4], equipo13Pronostico[5], equipo13Pronostico[6], equipo13Pronostico[7]);
			Pronostico pronosticoPartido14 = new Pronostico(equipo14Pronostico[0], Integer.parseInt(equipo14Pronostico[1]), Integer.parseInt(equipo14Pronostico[2]), equipo14Pronostico[3], equipo14Pronostico[4], equipo14Pronostico[5], equipo14Pronostico[6], equipo14Pronostico[7]);
			Pronostico pronosticoPartido15 = new Pronostico(equipo15Pronostico[0], Integer.parseInt(equipo15Pronostico[1]), Integer.parseInt(equipo15Pronostico[2]), equipo15Pronostico[3], equipo15Pronostico[4], equipo15Pronostico[5], equipo15Pronostico[6], equipo15Pronostico[7]);
			Pronostico pronosticoPartido16 = new Pronostico(equipo16Pronostico[0], Integer.parseInt(equipo16Pronostico[1]), Integer.parseInt(equipo16Pronostico[2]), equipo16Pronostico[3], equipo16Pronostico[4], equipo16Pronostico[5], equipo16Pronostico[6], equipo16Pronostico[7]);
			Pronostico pronosticoPartido17 = new Pronostico(equipo17Pronostico[0], Integer.parseInt(equipo17Pronostico[1]), Integer.parseInt(equipo17Pronostico[2]), equipo17Pronostico[3], equipo17Pronostico[4], equipo17Pronostico[5], equipo17Pronostico[6], equipo17Pronostico[7]);
			Pronostico pronosticoPartido18 = new Pronostico(equipo18Pronostico[0], Integer.parseInt(equipo18Pronostico[1]), Integer.parseInt(equipo18Pronostico[2]), equipo18Pronostico[3], equipo18Pronostico[4], equipo18Pronostico[5], equipo18Pronostico[6], equipo18Pronostico[7]);
			
			
			//Con estas dos lines, muestro titulo de columnas
			System.out.println("ARCHIVO RESULTADO");
			
			System.out.println(equipo0Resultado[0] + "    " + equipo0Resultado[1] + "    " + equipo0Resultado[2] + "        " + equipo0Resultado[3] + "    " + equipo0Resultado[4] + "    " + equipo0Resultado[5]);
			System.out.println("   " + resultadoPartido1.getIdPartido() + "         " + resultadoPartido1.getIdRonda() + "      " + resultadoPartido1.getEquipo1() + "           " + resultadoPartido1.getGolesEquipo1() + "              " + resultadoPartido1.getGolesEquipo2() + "         " + resultadoPartido1.getEquipo2());
			System.out.println("   " + resultadoPartido2.getIdPartido() + "         " + resultadoPartido2.getIdRonda() + "      " + resultadoPartido2.getEquipo1() + "             " + resultadoPartido2.getGolesEquipo1() + "              " + resultadoPartido2.getGolesEquipo2() + "         " + resultadoPartido2.getEquipo2());
			System.out.println("   " + resultadoPartido3.getIdPartido() + "         " + resultadoPartido3.getIdRonda() + "      " + resultadoPartido3.getEquipo1() + "           " + resultadoPartido3.getGolesEquipo1() + "              " + resultadoPartido3.getGolesEquipo2() + "         " + resultadoPartido3.getEquipo2());
			System.out.println("   " + resultadoPartido4.getIdPartido() + "         " + resultadoPartido4.getIdRonda() + "      " + resultadoPartido4.getEquipo1() + "      " + resultadoPartido4.getGolesEquipo1() + "              " + resultadoPartido4.getGolesEquipo2() + "         " + resultadoPartido4.getEquipo2());
			System.out.println("   " + resultadoPartido5.getIdPartido() + "         " + resultadoPartido5.getIdRonda() + "      " + resultadoPartido5.getEquipo1() + "           " + resultadoPartido5.getGolesEquipo1() + "              " + resultadoPartido5.getGolesEquipo2() + "         " + resultadoPartido5.getEquipo2());
			System.out.println("   " + resultadoPartido6.getIdPartido() + "         " + resultadoPartido6.getIdRonda() + "      " + resultadoPartido6.getEquipo1() + "      " + resultadoPartido6.getGolesEquipo1() + "              " + resultadoPartido6.getGolesEquipo2() + "         " + resultadoPartido6.getEquipo2());
			
			System.out.println("\n");
			
			System.out.println("ARCHIVO PRONOSTICO");
			System.out.println(equipo0Pronostico[0] + "  " + equipo0Pronostico[1] + "  " + equipo0Pronostico[2] + "   " + equipo0Pronostico[3] + "         " + equipo0Pronostico[4] + "     " + equipo0Pronostico[5] + "     " + equipo0Pronostico[6] + "     " + equipo0Pronostico[7]);
			System.out.println(pronosticoPartido1.getParticipante() + "          " + pronosticoPartido1.getNroPartidoPronostico() + "       " + pronosticoPartido1.getNroRondaPronostico() + "     " + pronosticoPartido1.getEquipo1() + "         " + pronosticoPartido1.getGana1() + "         " + pronosticoPartido1.getEmpate() + "          " + pronosticoPartido1.getGana2() + "       " + pronosticoPartido1.getEquipo2());
			System.out.println(pronosticoPartido2.getParticipante() + "          " + pronosticoPartido2.getNroPartidoPronostico() + "       " + pronosticoPartido1.getNroRondaPronostico() + "     " + pronosticoPartido2.getEquipo1() + "           " + pronosticoPartido2.getGana1() + "         " + pronosticoPartido2.getEmpate() +  "          " + pronosticoPartido2.getGana2() + "       " + pronosticoPartido2.getEquipo2());
			System.out.println(pronosticoPartido3.getParticipante() + "          " + pronosticoPartido3.getNroPartidoPronostico() + "       " + pronosticoPartido1.getNroRondaPronostico() + "     " + pronosticoPartido3.getEquipo1() + "         " + pronosticoPartido3.getGana1() + "         " + pronosticoPartido3.getEmpate() + "          " + pronosticoPartido3.getGana2() + "       " + pronosticoPartido3.getEquipo2());
			System.out.println(pronosticoPartido4.getParticipante() + "          " + pronosticoPartido4.getNroPartidoPronostico() + "       " + pronosticoPartido1.getNroRondaPronostico() + "     " + pronosticoPartido4.getEquipo1() + "    " + pronosticoPartido4.getGana1() + "         " + pronosticoPartido4.getEmpate() +  "          " + pronosticoPartido4.getGana2() + "       " + pronosticoPartido4.getEquipo2());
			System.out.println(pronosticoPartido5.getParticipante() + "          " + pronosticoPartido5.getNroPartidoPronostico() + "       " + pronosticoPartido1.getNroRondaPronostico() + "     " + pronosticoPartido5.getEquipo1() + "         " + pronosticoPartido5.getGana1() + "         " + pronosticoPartido5.getEmpate() + "          " + pronosticoPartido5.getGana2() + "       " + pronosticoPartido5.getEquipo2());
			System.out.println(pronosticoPartido6.getParticipante() + "          " + pronosticoPartido6.getNroPartidoPronostico() + "       " + pronosticoPartido1.getNroRondaPronostico() + "     " + pronosticoPartido6.getEquipo1() + "    " + pronosticoPartido6.getGana1() + "         " + pronosticoPartido6.getEmpate() +  "          " + pronosticoPartido6.getGana2() + "       " + pronosticoPartido6.getEquipo2());
			
			System.out.println(pronosticoPartido7.getParticipante() + "            " + pronosticoPartido7.getNroPartidoPronostico() + "       " + pronosticoPartido7.getNroRondaPronostico() + "     " + pronosticoPartido7.getEquipo1() + "         " + pronosticoPartido7.getGana1() + "         " + pronosticoPartido7.getEmpate() + "          " + pronosticoPartido7.getGana2() + "       " + pronosticoPartido7.getEquipo2());
			System.out.println(pronosticoPartido8.getParticipante() + "            " + pronosticoPartido8.getNroPartidoPronostico() + "       " + pronosticoPartido8.getNroRondaPronostico() + "     " + pronosticoPartido8.getEquipo1() + "           " + pronosticoPartido8.getGana1() + "         " + pronosticoPartido8.getEmpate() +  "          " + pronosticoPartido8.getGana2() + "       " + pronosticoPartido8.getEquipo2());
			System.out.println(pronosticoPartido9.getParticipante() + "            " + pronosticoPartido9.getNroPartidoPronostico() + "       " + pronosticoPartido9.getNroRondaPronostico() + "     " + pronosticoPartido9.getEquipo1() + "         " + pronosticoPartido9.getGana1() + "         " + pronosticoPartido9.getEmpate() + "          " + pronosticoPartido9.getGana2() + "       " + pronosticoPartido9.getEquipo2());
			System.out.println(pronosticoPartido10.getParticipante() + "            " + pronosticoPartido10.getNroPartidoPronostico() + "       " + pronosticoPartido10.getNroRondaPronostico() + "     " + pronosticoPartido10.getEquipo1() + "    " + pronosticoPartido10.getGana1() + "         " + pronosticoPartido10.getEmpate() +  "          " + pronosticoPartido10.getGana2() + "       " + pronosticoPartido10.getEquipo2());
			System.out.println(pronosticoPartido11.getParticipante() + "            " + pronosticoPartido11.getNroPartidoPronostico() + "       " + pronosticoPartido11.getNroRondaPronostico() + "     " + pronosticoPartido11.getEquipo1() + "         " + pronosticoPartido11.getGana1() + "         " + pronosticoPartido11.getEmpate() + "          " + pronosticoPartido11.getGana2() + "       " + pronosticoPartido11.getEquipo2());
			System.out.println(pronosticoPartido12.getParticipante() + "            " + pronosticoPartido12.getNroPartidoPronostico() + "       " + pronosticoPartido12.getNroRondaPronostico() + "     " + pronosticoPartido12.getEquipo1() + "    " + pronosticoPartido12.getGana1() + "         " + pronosticoPartido12.getEmpate() +  "          " + pronosticoPartido12.getGana2() + "       " + pronosticoPartido12.getEquipo2());
			
			System.out.println(pronosticoPartido13.getParticipante() + "           " + pronosticoPartido13.getNroPartidoPronostico() + "       " + pronosticoPartido13.getNroRondaPronostico() + "     " + pronosticoPartido13.getEquipo1() + "         " + pronosticoPartido13.getGana1() + "         " + pronosticoPartido13.getEmpate() + "          " + pronosticoPartido13.getGana2() + "       " + pronosticoPartido13.getEquipo2());
			System.out.println(pronosticoPartido14.getParticipante() + "           " + pronosticoPartido14.getNroPartidoPronostico() + "       " + pronosticoPartido14.getNroRondaPronostico() + "     " + pronosticoPartido14.getEquipo1() + "           " + pronosticoPartido14.getGana1() + "         " + pronosticoPartido14.getEmpate() +  "          " + pronosticoPartido14.getGana2() + "       " + pronosticoPartido14.getEquipo2());
			System.out.println(pronosticoPartido15.getParticipante() + "           " + pronosticoPartido15.getNroPartidoPronostico() + "       " + pronosticoPartido15.getNroRondaPronostico() + "     " + pronosticoPartido15.getEquipo1() + "         " + pronosticoPartido15.getGana1() + "         " + pronosticoPartido15.getEmpate() + "          " + pronosticoPartido15.getGana2() + "       " + pronosticoPartido15.getEquipo2());
			System.out.println(pronosticoPartido16.getParticipante() + "           " + pronosticoPartido16.getNroPartidoPronostico() + "       " + pronosticoPartido16.getNroRondaPronostico() + "     " + pronosticoPartido16.getEquipo1() + "    " + pronosticoPartido16.getGana1() + "         " + pronosticoPartido16.getEmpate() +  "          " + pronosticoPartido16.getGana2() + "       " + pronosticoPartido16.getEquipo2());
			System.out.println(pronosticoPartido17.getParticipante() + "           " + pronosticoPartido17.getNroPartidoPronostico() + "       " + pronosticoPartido17.getNroRondaPronostico() + "     " + pronosticoPartido17.getEquipo1() + "         " + pronosticoPartido17.getGana1() + "         " + pronosticoPartido17.getEmpate() + "          " + pronosticoPartido17.getGana2() + "       " + pronosticoPartido17.getEquipo2());
			System.out.println(pronosticoPartido18.getParticipante() + "           " + pronosticoPartido18.getNroPartidoPronostico() + "       " + pronosticoPartido18.getNroRondaPronostico() + "     " + pronosticoPartido18.getEquipo1() + "    " + pronosticoPartido18.getGana1() + "         " + pronosticoPartido18.getEmpate() +  "          " + pronosticoPartido18.getGana2() + "       " + pronosticoPartido18.getEquipo2());
			
			
			
			System.out.println("\n");
			String[] resulPartido1 = resultadoPartido1.getGanador();
			String[] resulPartido2 = resultadoPartido2.getGanador();
			String[] resulPartido3 = resultadoPartido3.getGanador();
			String[] resulPartido4 = resultadoPartido4.getGanador();
			String[] resulPartido5 = resultadoPartido5.getGanador();
			String[] resulPartido6 = resultadoPartido6.getGanador();
			
			
			// **************************************************
			// PARA sumar puntos del partido 1 (Mariana)
			// **************************************************
			Integer valor = 0;
			if(resulPartido1[4] == "x") {
				if(Objects.equals(resulPartido1[4], pronosticoPartido1.getGana1())) {
					if (participan.containsKey(pronosticoPartido1.getParticipante())) {
						valor = participan.get(pronosticoPartido1.getParticipante()) + 1;
						participan.put(pronosticoPartido1.getParticipante(),(valor));
					}
				} 
			}
			

			if(resulPartido1[5] == "x") {
				if(Objects.equals(resulPartido1[5], pronosticoPartido1.getEmpate())) {
					if (participan.containsKey(pronosticoPartido1.getParticipante())) {
						valor = participan.get(pronosticoPartido1.getParticipante()) + 1;
						participan.put(pronosticoPartido1.getParticipante(),(valor));
					}
				} 
			}
			
			
			if(resulPartido1[6] == "x") {
				if(Objects.equals(resulPartido1[6], pronosticoPartido1.getGana2())) {
					if (participan.containsKey(pronosticoPartido1.getParticipante())) {
						valor = participan.get(pronosticoPartido1.getParticipante()) + 1;
						participan.put(pronosticoPartido1.getParticipante(),(valor));
					}
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 2 (Mariana)
			// **************************************************
			if(resulPartido2[4] == "x") {
				if(Objects.equals(resulPartido2[4], pronosticoPartido2.getGana1())) {
					if (participan.containsKey(pronosticoPartido2.getParticipante())) {
						valor = participan.get(pronosticoPartido2.getParticipante()) + 1;
						participan.put(pronosticoPartido2.getParticipante(),(valor));
					}
				} 
			}
						

			if(resulPartido2[5] == "x") {
				if(Objects.equals(resulPartido2[5], pronosticoPartido2.getEmpate())) {
					if (participan.containsKey(pronosticoPartido2.getParticipante())) {
						valor = participan.get(pronosticoPartido2.getParticipante()) + 1;
						participan.put(pronosticoPartido2.getParticipante(),(valor));
					}
				} 
			}
			
			
			if(resulPartido2[6] == "x") {
				if(Objects.equals(resulPartido2[6], pronosticoPartido2.getGana2())) {
					if (participan.containsKey(pronosticoPartido2.getParticipante())) {
						valor = participan.get(pronosticoPartido2.getParticipante()) + 1;
						participan.put(pronosticoPartido2.getParticipante(),(valor));
					}
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 3 (Mariana)
			// **************************************************
			if(resulPartido3[4] == "x") {
				if(Objects.equals(resulPartido3[4], pronosticoPartido3.getGana1())) {
					if (participan.containsKey(pronosticoPartido3.getParticipante())) {
						valor = participan.get(pronosticoPartido3.getParticipante()) + 1;
						participan.put(pronosticoPartido3.getParticipante(),(valor));
					}
				} 
			}
			

			if(resulPartido3[5] == "x") {
				if(Objects.equals(resulPartido3[5], pronosticoPartido3.getEmpate())) {
					if (participan.containsKey(pronosticoPartido3.getParticipante())) {
						valor = participan.get(pronosticoPartido3.getParticipante()) + 1;
						participan.put(pronosticoPartido3.getParticipante(),(valor));
					}
				} 
			}
			
			
			if(resulPartido3[6] == "x") {
				if(Objects.equals(resulPartido3[6], pronosticoPartido3.getGana2())) {
					if (participan.containsKey(pronosticoPartido3.getParticipante())) {
						valor = participan.get(pronosticoPartido3.getParticipante()) + 1;
						participan.put(pronosticoPartido3.getParticipante(),(valor));
					}
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 4 (Mariana)
			// **************************************************
			if(resulPartido4[4] == "x") {
				if(Objects.equals(resulPartido4[4], pronosticoPartido4.getGana1())) {
					if (participan.containsKey(pronosticoPartido4.getParticipante())) {
						valor = participan.get(pronosticoPartido4.getParticipante()) + 1;
						participan.put(pronosticoPartido4.getParticipante(),(valor));
					}
				} 
			}
			

			if(resulPartido4[5] == "x") {
				if(Objects.equals(resulPartido4[5], pronosticoPartido4.getEmpate())) {
					if (participan.containsKey(pronosticoPartido4.getParticipante())) {
						valor = participan.get(pronosticoPartido4.getParticipante()) + 1;
						participan.put(pronosticoPartido4.getParticipante(),(valor));
					}
				} 
			}
			
			
			if(resulPartido4[6] == "x") {
				if(Objects.equals(resulPartido4[6], pronosticoPartido4.getGana2())) {
					if (participan.containsKey(pronosticoPartido4.getParticipante())) {
						valor = participan.get(pronosticoPartido4.getParticipante()) + 1;
						participan.put(pronosticoPartido4.getParticipante(),(valor));
					}
				} 
			}

			
			
			// **************************************************
			// PARA sumar puntos del partido 5 (Mariana)
			// **************************************************
			if(resulPartido5[4] == "x") {
				if(Objects.equals(resulPartido5[4], pronosticoPartido5.getGana1())) {
					if (participan.containsKey(pronosticoPartido5.getParticipante())) {
						valor = participan.get(pronosticoPartido5.getParticipante()) + 1;
						participan.put(pronosticoPartido5.getParticipante(),(valor));
					}
				} 
			}
						

			if(resulPartido5[5] == "x") {
				if(Objects.equals(resulPartido5[5], pronosticoPartido5.getEmpate())) {
					if (participan.containsKey(pronosticoPartido5.getParticipante())) {
						valor = participan.get(pronosticoPartido5.getParticipante()) + 1;
						participan.put(pronosticoPartido5.getParticipante(),(valor));
					}
				} 
			}
						
						
			if(resulPartido5[6] == "x") {
				if(Objects.equals(resulPartido5[6], pronosticoPartido5.getGana2())) {
					if (participan.containsKey(pronosticoPartido5.getParticipante())) {
						valor = participan.get(pronosticoPartido5.getParticipante()) + 1;
						participan.put(pronosticoPartido5.getParticipante(),(valor));
					}
				} 
			}
						
						
			// **************************************************
			// PARA sumar puntos del partido 6 (Mariana)
			// **************************************************
			if(resulPartido6[4] == "x") {
				if(Objects.equals(resulPartido6[4], pronosticoPartido6.getGana1())) {
					if (participan.containsKey(pronosticoPartido6.getParticipante())) {
						valor = participan.get(pronosticoPartido6.getParticipante()) + 1;
						participan.put(pronosticoPartido6.getParticipante(),(valor));
					}
				} 
			}
									

			if(resulPartido6[5] == "x") {
				if(Objects.equals(resulPartido6[5], pronosticoPartido6.getEmpate())) {
					if (participan.containsKey(pronosticoPartido6.getParticipante())) {
						valor = participan.get(pronosticoPartido6.getParticipante()) + 1;
						participan.put(pronosticoPartido6.getParticipante(),(valor));
					}
				} 
			}
						
						
			if(resulPartido6[6] == "x") {
				if(Objects.equals(resulPartido6[6], pronosticoPartido6.getGana2())) {
					if (participan.containsKey(pronosticoPartido6.getParticipante())) {
						valor = participan.get(pronosticoPartido6.getParticipante()) + 1;
						participan.put(pronosticoPartido6.getParticipante(),(valor));
					}
				} 
			}			
			
			
//********************************************************************************************
			// **************************************************
			// para sumar puntos del partido 1 (Pedro)
			// **************************************************
			if(resulPartido1[4] == "x") {
				if(Objects.equals(resulPartido1[4], pronosticoPartido7.getGana1())) {
					if (participan.containsKey(pronosticoPartido7.getParticipante())) {
						valor = participan.get(pronosticoPartido7.getParticipante()) + 1;
						participan.put(pronosticoPartido7.getParticipante(),(valor));
					}
				} 
			}
						

			if(resulPartido1[5] == "x") {
				if(Objects.equals(resulPartido1[5], pronosticoPartido7.getEmpate())) {
					if (participan.containsKey(pronosticoPartido7.getParticipante())) {
						valor = participan.get(pronosticoPartido7.getParticipante()) + 1;
						participan.put(pronosticoPartido7.getParticipante(),(valor));
					}
				} 
			}
						
						
			if(resulPartido1[6] == "x") {
				if(Objects.equals(resulPartido1[6], pronosticoPartido7.getGana2())) {
					if (participan.containsKey(pronosticoPartido7.getParticipante())) {
						valor = participan.get(pronosticoPartido7.getParticipante()) + 1;
						participan.put(pronosticoPartido7.getParticipante(),(valor));
					}
				} 
			}
						
						
			// **************************************************
			// PARA sumar puntos del partido 2 (Pedro)
			// **************************************************
			if(resulPartido2[4] == "x") {
				if(Objects.equals(resulPartido2[4], pronosticoPartido8.getGana1())) {
					if (participan.containsKey(pronosticoPartido8.getParticipante())) {
						valor = participan.get(pronosticoPartido8.getParticipante()) + 1;
						participan.put(pronosticoPartido8.getParticipante(),(valor));
					}
				} 
			}
									

			if(resulPartido2[5] == "x") {
				if(Objects.equals(resulPartido2[5], pronosticoPartido8.getEmpate())) {
					if (participan.containsKey(pronosticoPartido8.getParticipante())) {
						valor = participan.get(pronosticoPartido8.getParticipante()) + 1;
						participan.put(pronosticoPartido8.getParticipante(),(valor));
					}
				} 
			}
						
						
			if(resulPartido2[6] == "x") {
				if(Objects.equals(resulPartido2[6], pronosticoPartido8.getGana2())) {
					if (participan.containsKey(pronosticoPartido8.getParticipante())) {
						valor = participan.get(pronosticoPartido8.getParticipante()) + 1;
						participan.put(pronosticoPartido8.getParticipante(),(valor));
					}
				} 
			}
						
						
			// **************************************************
			// PARA sumar puntos del partido 3 (Pedro)
			// **************************************************
			if(resulPartido3[4] == "x") {
				if(Objects.equals(resulPartido3[4], pronosticoPartido9.getGana1())) {
					if (participan.containsKey(pronosticoPartido9.getParticipante())) {
						valor = participan.get(pronosticoPartido9.getParticipante()) + 1;
						participan.put(pronosticoPartido9.getParticipante(),(valor));
					}
				} 
			}
						

			if(resulPartido3[5] == "x") {
				if(Objects.equals(resulPartido3[5], pronosticoPartido9.getEmpate())) {
					if (participan.containsKey(pronosticoPartido9.getParticipante())) {
						valor = participan.get(pronosticoPartido9.getParticipante()) + 1;
						participan.put(pronosticoPartido9.getParticipante(),(valor));
					}
				} 
			}
						
						
			if(resulPartido3[4] == "x") {
				if(Objects.equals(resulPartido3[4], pronosticoPartido9.getGana2())) {
					if (participan.containsKey(pronosticoPartido9.getParticipante())) {
						valor = participan.get(pronosticoPartido9.getParticipante()) + 1;
						participan.put(pronosticoPartido9.getParticipante(),(valor));
					}
				} 
			}
						
				
			// **************************************************
			// PARA sumar puntos del partido 4 (Pedro)
			// **************************************************
			if(resulPartido4[4] == "x") {
				if(Objects.equals(resulPartido4[4], pronosticoPartido10.getGana1())) {
					if (participan.containsKey(pronosticoPartido10.getParticipante())) {
						valor = participan.get(pronosticoPartido10.getParticipante()) + 1;
						participan.put(pronosticoPartido10.getParticipante(),(valor));
					}
				} 
			}
						

			if(resulPartido4[5] == "x") {
				if(Objects.equals(resulPartido4[5], pronosticoPartido10.getEmpate())) {
					if (participan.containsKey(pronosticoPartido10.getParticipante())) {
						valor = participan.get(pronosticoPartido10.getParticipante()) + 1;
						participan.put(pronosticoPartido10.getParticipante(),(valor));
					}
				} 
			}
						
						
			if(resulPartido4[6] == "x") {
				if(Objects.equals(resulPartido4[6], pronosticoPartido10.getGana2())) {
					if (participan.containsKey(pronosticoPartido10.getParticipante())) {
						valor = participan.get(pronosticoPartido10.getParticipante()) + 1;
						participan.put(pronosticoPartido10.getParticipante(),(valor));
					}
				} 
			}


			// **************************************************
			// PARA sumar puntos del partido 5 (Pedro)
			// **************************************************
			if(resulPartido5[4] == "x") {
				if(Objects.equals(resulPartido5[4], pronosticoPartido11.getGana1())) {
					if (participan.containsKey(pronosticoPartido11.getParticipante())) {
						valor = participan.get(pronosticoPartido11.getParticipante()) + 1;
						participan.put(pronosticoPartido11.getParticipante(),(valor));
					}
				} 
			}
						

			if(resulPartido5[5] == "x") {
				if(Objects.equals(resulPartido5[5], pronosticoPartido11.getEmpate())) {
					if (participan.containsKey(pronosticoPartido11.getParticipante())) {
						valor = participan.get(pronosticoPartido11.getParticipante()) + 1;
						participan.put(pronosticoPartido11.getParticipante(),(valor));
					}
				} 
			}
						
						
			if(resulPartido5[6] == "x") {
				if(Objects.equals(resulPartido5[6], pronosticoPartido11.getGana2())) {
					if (participan.containsKey(pronosticoPartido11.getParticipante())) {
						valor = participan.get(pronosticoPartido11.getParticipante()) + 1;
						participan.put(pronosticoPartido11.getParticipante(),(valor));
					}
				} 
			}
			
						
			// **************************************************
			// para sumar puntos del partido 6 (Pedro)
			// **************************************************
			if(resulPartido6[4] == "x") {
				if(Objects.equals(resulPartido6[4], pronosticoPartido12.getGana1())) {
					if (participan.containsKey(pronosticoPartido12.getParticipante())) {
						valor = participan.get(pronosticoPartido12.getParticipante()) + 1;
						participan.put(pronosticoPartido12.getParticipante(),(valor));
					}
				} 
			}
									

			if(resulPartido6[5] == "x") {
				if(Objects.equals(resulPartido6[5], pronosticoPartido12.getEmpate())) {
					if (participan.containsKey(pronosticoPartido12.getParticipante())) {
						valor = participan.get(pronosticoPartido12.getParticipante()) + 1;
						participan.put(pronosticoPartido12.getParticipante(),(valor));
					}
				} 
			}

			if(resulPartido6[6] == "x") {
				if(Objects.equals(resulPartido6[6], pronosticoPartido12.getGana2())) {
					if (participan.containsKey(pronosticoPartido12.getParticipante())) {
						valor = participan.get(pronosticoPartido12.getParticipante()) + 1;
						participan.put(pronosticoPartido12.getParticipante(),(valor));
					}
				} 
			}
			

//****************************************************************************************************
			// **************************************************
			// PARA sumar puntos del partido 1 (Julian)
			// **************************************************
			if(resulPartido1[4] == "x") {
				if(Objects.equals(resulPartido1[4], pronosticoPartido13.getGana1())) {
					if (participan.containsKey(pronosticoPartido13.getParticipante())) {
						valor = participan.get(pronosticoPartido13.getParticipante()) + 1;
						participan.put(pronosticoPartido13.getParticipante(),(valor));
					}
				} 
			}
			

			if(resulPartido1[5] == "x") {
				if(Objects.equals(resulPartido1[5], pronosticoPartido13.getEmpate())) {
					if (participan.containsKey(pronosticoPartido13.getParticipante())) {
						valor = participan.get(pronosticoPartido13.getParticipante()) + 1;
						participan.put(pronosticoPartido13.getParticipante(),(valor));
					}
				} 
			}
			
			
			if(resulPartido1[6] == "x") {
				if(Objects.equals(resulPartido1[6], pronosticoPartido13.getGana2())) {
					if (participan.containsKey(pronosticoPartido13.getParticipante())) {
						valor = participan.get(pronosticoPartido13.getParticipante()) + 1;
						participan.put(pronosticoPartido13.getParticipante(),(valor));
					}
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 2 (Julian)
			// **************************************************
			if(resulPartido2[4] == "x") {
				if(Objects.equals(resulPartido2[4], pronosticoPartido14.getGana1())) {
					if (participan.containsKey(pronosticoPartido14.getParticipante())) {
						valor = participan.get(pronosticoPartido14.getParticipante()) + 1;
						participan.put(pronosticoPartido14.getParticipante(),(valor));
					}
				} 
			}
						

			if(resulPartido2[5] == "x") {
				if(Objects.equals(resulPartido2[5], pronosticoPartido14.getEmpate())) {
					if (participan.containsKey(pronosticoPartido14.getParticipante())) {
						valor = participan.get(pronosticoPartido14.getParticipante()) + 1;
						participan.put(pronosticoPartido14.getParticipante(),(valor));
					}
				} 
			}
			
			
			if(resulPartido2[6] == "x") {
				if(Objects.equals(resulPartido2[4], pronosticoPartido14.getGana2())) {
					if (participan.containsKey(pronosticoPartido14.getParticipante())) {
						valor = participan.get(pronosticoPartido14.getParticipante()) + 1;
						participan.put(pronosticoPartido14.getParticipante(),(valor));
					}
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 3 (Julian)
			// **************************************************
			if(resulPartido3[4] == "x") {
				if(Objects.equals(resulPartido3[4], pronosticoPartido15.getGana1())) {
					if (participan.containsKey(pronosticoPartido15.getParticipante())) {
						valor = participan.get(pronosticoPartido15.getParticipante()) + 1;
						participan.put(pronosticoPartido15.getParticipante(),(valor));
					}
				} 
			}
			

			if(resulPartido3[5] == "x") {
				if(Objects.equals(resulPartido3[5], pronosticoPartido15.getEmpate())) {
					if (participan.containsKey(pronosticoPartido15.getParticipante())) {
						valor = participan.get(pronosticoPartido15.getParticipante()) + 1;
						participan.put(pronosticoPartido15.getParticipante(),(valor));
					}
				} 
			}
			
			
			if(resulPartido3[6] == "x") {
				if(Objects.equals(resulPartido3[6], pronosticoPartido15.getGana2())) {
					if (participan.containsKey(pronosticoPartido15.getParticipante())) {
						valor = participan.get(pronosticoPartido15.getParticipante()) + 1;
						participan.put(pronosticoPartido15.getParticipante(),(valor));
					}
				} 
			}
			
			
			// **************************************************
			// PARA sumar puntos del partido 4 (Julian)
			// **************************************************
			if(resulPartido4[4] == "x") {
				if(Objects.equals(resulPartido4[4], pronosticoPartido16.getGana1())) {
					if (participan.containsKey(pronosticoPartido16.getParticipante())) {
						valor = participan.get(pronosticoPartido16.getParticipante()) + 1;
						participan.put(pronosticoPartido16.getParticipante(),(valor));
					}
				} 
			}
			

			if(resulPartido4[5] == "x") {
				if(Objects.equals(resulPartido4[5], pronosticoPartido16.getEmpate())) {
					if (participan.containsKey(pronosticoPartido16.getParticipante())) {
						valor = participan.get(pronosticoPartido16.getParticipante()) + 1;
						participan.put(pronosticoPartido16.getParticipante(),(valor));
					}
				} 
			}
			
			
			if(resulPartido4[6] == "x") {
				if(Objects.equals(resulPartido4[6], pronosticoPartido16.getGana2())) {
					if (participan.containsKey(pronosticoPartido16.getParticipante())) {
						valor = participan.get(pronosticoPartido16.getParticipante()) + 1;
						participan.put(pronosticoPartido16.getParticipante(),(valor));
					}
				} 
			}

			
			
			// **************************************************
			// PARA sumar puntos del partido 5 (Julian)
			// **************************************************
			if(resulPartido5[4] == "x") {
				if(Objects.equals(resulPartido5[4], pronosticoPartido17.getGana1())) {
					if (participan.containsKey(pronosticoPartido17.getParticipante())) {
						valor = participan.get(pronosticoPartido17.getParticipante()) + 1;
						participan.put(pronosticoPartido17.getParticipante(),(valor));
					}
				} 
			}
						

			if(resulPartido5[5] == "x") {
				if(Objects.equals(resulPartido5[5], pronosticoPartido17.getEmpate())) {
					if (participan.containsKey(pronosticoPartido17.getParticipante())) {
						valor = participan.get(pronosticoPartido17.getParticipante()) + 1;
						participan.put(pronosticoPartido17.getParticipante(),(valor));
					}
				} 
			}
						
						
			if(resulPartido5[6] == "x") {
				if(Objects.equals(resulPartido5[6], pronosticoPartido17.getGana2())) {
					if (participan.containsKey(pronosticoPartido17.getParticipante())) {
						valor = participan.get(pronosticoPartido17.getParticipante()) + 1;
						participan.put(pronosticoPartido17.getParticipante(),(valor));
					}
				} 
			}
						
						
			// **************************************************
			// PARA sumar puntos del partido 6 (Julian)
			// **************************************************
			if(resulPartido6[4] == "x") {
				if(Objects.equals(resulPartido6[4], pronosticoPartido18.getGana1())) {
					if (participan.containsKey(pronosticoPartido18.getParticipante())) {
						valor = participan.get(pronosticoPartido18.getParticipante()) + 1;
						participan.put(pronosticoPartido18.getParticipante(),(valor));
					}
				} 
			}
									

			if(resulPartido6[5] == "x") {
				if(Objects.equals(resulPartido6[5], pronosticoPartido18.getEmpate())) {
					if (participan.containsKey(pronosticoPartido18.getParticipante())) {
						valor = participan.get(pronosticoPartido18.getParticipante()) + 1;
						participan.put(pronosticoPartido18.getParticipante(),(valor));
					}
				} 
			}
						
						
			if(resulPartido6[6] == "x") {
				if(Objects.equals(resulPartido6[6], pronosticoPartido18.getGana2())) {
					if (participan.containsKey(pronosticoPartido18.getParticipante())) {
						valor = participan.get(pronosticoPartido18.getParticipante()) + 1;
						participan.put(pronosticoPartido18.getParticipante(),(valor));
					}
				} 
			}			
			
			
			
			// Imprimo los los puntos
						
			for(HashMap.Entry<String, Integer> entry : participan.entrySet()) {
				System.out.printf("El participante: %s... Sumo: %d\n", entry.getKey(), entry.getValue());
			}
			
			
		}catch(IOException e) {        // comienza la excepcion
				System.out.println("Hubo un error en la operacion...");
				System.out.println(e.getMessage());
				System.exit(1);
		} 
			
	}   // termina main

}  // termina principal
