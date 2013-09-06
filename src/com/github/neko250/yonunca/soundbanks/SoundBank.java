package com.github.neko250.yonunca.soundbanks;

import java.util.*;

import com.badlogic.gdx.assets.AssetManager;

public class SoundBank {
	private ArrayList<Phrase> dataBase;
	private int index;
	
	public SoundBank(AssetManager assets) {
		long seed = System.nanoTime();
		
		dataBase = new ArrayList<Phrase>();
		index = 0;
		
		dataBase.add(new Phrase("audio/phrases/pablo/01_pablo.ogg",
				"He hecho el amor sin estar depilado."));
		dataBase.add(new Phrase("audio/phrases/pablo/02_pablo.ogg",
				"He sido masturbado en la calle."));
		dataBase.add(new Phrase("audio/phrases/pablo/03_pablo.ogg",
				"He ido a un cine porno."));
		dataBase.add(new Phrase("audio/phrases/pablo/04_pablo.ogg",
				"He visto un pene por webcam."));
		dataBase.add(new Phrase("audio/phrases/pablo/05_pablo.ogg",
				"He visto la TV desnudo."));
		dataBase.add(new Phrase("audio/phrases/pablo/06_pablo.ogg",
				"He sido infiel."));
		dataBase.add(new Phrase("audio/phrases/pablo/07_pablo.ogg",
				"He puesto celoso a alguien a proposito."));
		dataBase.add(new Phrase("audio/phrases/pablo/08_pablo.ogg",
				"He realizado una fantasia sexual."));
		dataBase.add(new Phrase("audio/phrases/pablo/09_pablo.ogg",
				"He tenido dos penes en mi boca."));
		dataBase.add(new Phrase("audio/phrases/pablo/0A_pablo.ogg",
				"He tenido/provocado un multiorgasmo."));
		dataBase.add(new Phrase("audio/phrases/pablo/0B_pablo.ogg",
				"Me he cambiado la edad para ligar."));
		dataBase.add(new Phrase("audio/phrases/pablo/0C_pablo.ogg",
				"He visto una pelicula porno entera."));
		dataBase.add(new Phrase("audio/phrases/pablo/0D_pablo.ogg",
				"He metido mano a mi novio/novia en un transporte publico."));
		dataBase.add(new Phrase("audio/phrases/pablo/0E_pablo.ogg",
				"Menti sobre el tamano de mi pene."));
		dataBase.add(new Phrase("audio/phrases/pablo/0F_pablo.ogg",
				"Me he liado con uno o mas de este grupo."));
		dataBase.add(new Phrase("audio/phrases/pablo/10_pablo.ogg",
				"He hecho una lluvia dorada."));
		dataBase.add(new Phrase("audio/phrases/pablo/11_pablo.ogg",
				"Me follaria a alguien de este grupo."));
		dataBase.add(new Phrase("audio/phrases/pablo/12_pablo.ogg",
				"Me he masturbado en publico."));
		dataBase.add(new Phrase("audio/phrases/pablo/13_pablo.ogg",
				"Me he metido un dedo en el culo."));
		dataBase.add(new Phrase("audio/phrases/pablo/14_pablo.ogg",
				"Me han metido un dedo en el culo."));
		dataBase.add(new Phrase("audio/phrases/pablo/15_pablo.ogg",
				"He probado el semen."));
		dataBase.add(new Phrase("audio/phrases/pablo/16_pablo.ogg",
				"Me han petado el culo."));
		dataBase.add(new Phrase("audio/phrases/pablo/17_pablo.ogg",
				"He gritado el nombre de otro/a mientras follaba."));
		dataBase.add(new Phrase("audio/phrases/pablo/18_pablo.ogg",
				"He gemido extremadamente fuerte."));
		dataBase.add(new Phrase("audio/phrases/pablo/19_pablo.ogg",
				"He tenido sexo con animales mirandome (Que animal?)."));
		dataBase.add(new Phrase("audio/phrases/pablo/1A_pablo.ogg",
				"He tenido un gatillazo."));
		dataBase.add(new Phrase("audio/phrases/pablo/1B_pablo.ogg",
				"Me he corrido en la primera penetracion."));
		dataBase.add(new Phrase("audio/phrases/pablo/1C_pablo.ogg",
				"He hecho un 69."));
		dataBase.add(new Phrase("audio/phrases/pablo/1D_pablo.ogg",
				"He follado resfriado/a."));
		dataBase.add(new Phrase("audio/phrases/pablo/1E_pablo.ogg",
				"He usado comida para el sexo."));
		dataBase.add(new Phrase("audio/phrases/pablo/1F_pablo.ogg",
				"He follado con la regla."));
		dataBase.add(new Phrase("audio/phrases/pablo/20_pablo.ogg",
				"He tenido sexo en un parque."));
		dataBase.add(new Phrase("audio/phrases/pablo/21_pablo.ogg",
				"He tenido sexo en un coche."));
		dataBase.add(new Phrase("audio/phrases/pablo/22_pablo.ogg",
				"He tenido sexo con mas gente en la misma casa."));
		dataBase.add(new Phrase("audio/phrases/pablo/23_pablo.ogg",
				"Me han pillado practicando el sexo."));
		dataBase.add(new Phrase("audio/phrases/pablo/24_pablo.ogg",
				"Me he masturbado con gente del mismo sexo en la misma habitacion."));
		dataBase.add(new Phrase("audio/phrases/pablo/25_pablo.ogg",
				"He corrido desnudo en un lugar publico."));
		dataBase.add(new Phrase("audio/phrases/pablo/26_pablo.ogg",
				"He tenido sexo borracho/a."));
		dataBase.add(new Phrase("audio/phrases/pablo/27_pablo.ogg",
				"He tenido sexo borracho/a y no lo he recordado al dia siguiente."));
		dataBase.add(new Phrase("audio/phrases/pablo/28_pablo.ogg",
				"He hecho un trio."));
		dataBase.add(new Phrase("audio/phrases/pablo/29_pablo.ogg",
				"He estado en una orgia."));
		dataBase.add(new Phrase("audio/phrases/pablo/2A_pablo.ogg",
				"He hecho un bukkake."));
		dataBase.add(new Phrase("audio/phrases/pablo/2B_pablo.ogg",
				"Me he lesionado teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/pablo/2C_pablo.ogg",
				"He tenido una infeccion por tener sexo."));
		
		dataBase.add(new Phrase("audio/phrases/mary/01_mary.ogg",
				"Se me han corrido en la cara."));
		dataBase.add(new Phrase("audio/phrases/mary/02_mary.ogg",
				"He provocado/tenido un squirting."));
		dataBase.add(new Phrase("audio/phrases/mary/03_mary.ogg",
				"Me he masturbado pensando en cuando me masturbaba."));
		dataBase.add(new Phrase("audio/phrases/mary/04_mary.ogg",
				"Me he masturbado pensando en un familiar."));
		dataBase.add(new Phrase("audio/phrases/mary/05_mary.ogg",
				"Me he masturbado pensando en la madre de un amigo."));
		dataBase.add(new Phrase("audio/phrases/mary/06_mary.ogg",
				"Me he restregado contra algo para satisfacerme."));
		dataBase.add(new Phrase("audio/phrases/mary/07_mary.ogg",
				"He tenido sexo en un balcon/ventana."));
		dataBase.add(new Phrase("audio/phrases/mary/08_mary.ogg",
				"He esposado a alguien en la cama."));
		dataBase.add(new Phrase("audio/phrases/mary/09_mary.ogg",
				"Me he quedado dormido mientras me masturbaba."));
		dataBase.add(new Phrase("audio/phrases/mary/0A_mary.ogg",
				"Me he quedado dormido teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/0B_mary.ogg",
				"He practicado fetichismo con los pies."));
		dataBase.add(new Phrase("audio/phrases/mary/0C_mary.ogg",
				"He hecho un deep-throat."));
		dataBase.add(new Phrase("audio/phrases/mary/0D_mary.ogg",
				"He usado objetos punzantes teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/0E_mary.ogg",
				"He usado fuego teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/0F_mary.ogg",
				"He usado latex/cuero teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/10_mary.ogg",
				"He usado bolas chinas."));
		dataBase.add(new Phrase("audio/phrases/mary/11_mary.ogg",
				"He hecho bondage."));
		dataBase.add(new Phrase("audio/phrases/mary/12_mary.ogg",
				"Me he arrepentido de acostarme/liarme con alguien."));
		dataBase.add(new Phrase("audio/phrases/mary/13_mary.ogg",
				"He tenido dudas sobre mi sexualidad."));
		dataBase.add(new Phrase("audio/phrases/mary/14_mary.ogg",
				"Me han escupido teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/15_mary.ogg",
				"He escupido teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/16_mary.ogg",
				"He dicho obscenidades teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/17_mary.ogg",
				"He usado hielo teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/18_mary.ogg",
				"He follado en la encimera de la cocina."));
		dataBase.add(new Phrase("audio/phrases/mary/19_mary.ogg",
				"He follado encima de un electrodomestico."));
		dataBase.add(new Phrase("audio/phrases/mary/1A_mary.ogg",
				"He tenido sexo oral conduciendo un coche."));
		dataBase.add(new Phrase("audio/phrases/mary/1B_mary.ogg",
				"No le he encontrado el clitoris a una chica."));
		dataBase.add(new Phrase("audio/phrases/mary/1C_mary.ogg",
				"He querido follarme a alguien de este grupo."));
		dataBase.add(new Phrase("audio/phrases/mary/1D_mary.ogg",
				"Me he follado/liado con alguien que estaba en una relacion."));
		dataBase.add(new Phrase("audio/phrases/mary/1E_mary.ogg",
				"Me he masturbado usando el movil de vibrador."));
		dataBase.add(new Phrase("audio/phrases/mary/1F_mary.ogg",
				"He tenido conversaciones sexuales por telefono."));
		dataBase.add(new Phrase("audio/phrases/mary/20_mary.ogg",
				"He tenido sexo homosexual."));
		dataBase.add(new Phrase("audio/phrases/mary/21_mary.ogg",
				"He usado a alguien para poner celoso a un tercero."));
		dataBase.add(new Phrase("audio/phrases/mary/22_mary.ogg",
				"Me han usado para poner celoso a un tercero."));
		dataBase.add(new Phrase("audio/phrases/mary/23_mary.ogg",
				"He usado a una persona solo para tener sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/24_mary.ogg",
				"Me he acostado con alguien de quien no se su nombre."));
		dataBase.add(new Phrase("audio/phrases/mary/25_mary.ogg",
				"He tenido sexo en una habitacion con espejos."));
		dataBase.add(new Phrase("audio/phrases/mary/26_mary.ogg",
				"Me he grabado mientras tenia sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/27_mary.ogg",
				"Me he grabado masturbandome."));
		dataBase.add(new Phrase("audio/phrases/mary/28_mary.ogg",
				"He representado un \"rol\" teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/29_mary.ogg",
				"Me he disfrazado para tener sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/2A_mary.ogg",
				"Me he peido teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/2B_mary.ogg",
				"Me/se he/ha tirado un peo vaginal teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/mary/2C_mary.ogg",
				"He pasado de culo a boca."));
		
		dataBase.add(new Phrase("audio/phrases/nano/01_nano.ogg",
				"He hecho/Me han hecho una cubana."));
		dataBase.add(new Phrase("audio/phrases/nano/02_nano.ogg",
				"Me he corrido/Se me han corrido en el culo."));
		dataBase.add(new Phrase("audio/phrases/nano/03_nano.ogg",
				"Me he corrido en la primera penetracion anal."));
		dataBase.add(new Phrase("audio/phrases/nano/04_nano.ogg",
				"He practicado asfixia."));
		dataBase.add(new Phrase("audio/phrases/nano/05_nano.ogg",
				"He practicado sexo en la playa."));
		dataBase.add(new Phrase("audio/phrases/nano/06_nano.ogg",
				"Le he visto las tetas a una amiga."));
		dataBase.add(new Phrase("audio/phrases/nano/07_nano.ogg",
				"Me he masturbado en clase."));
		dataBase.add(new Phrase("audio/phrases/nano/08_nano.ogg",
				"He tenido sexo en un ascensor."));
		dataBase.add(new Phrase("audio/phrases/nano/09_nano.ogg",
				"Le he dicho cosas guarras con fines sexuales a una persona en publico."));
		dataBase.add(new Phrase("audio/phrases/nano/0A_nano.ogg",
				"He llamado a una linea erotica."));
		dataBase.add(new Phrase("audio/phrases/nano/0B_nano.ogg",
				"He hecho un chupeton en una zona intima."));
		dataBase.add(new Phrase("audio/phrases/nano/0C_nano.ogg",
				"Me han sorprendido haciendolo."));
		dataBase.add(new Phrase("audio/phrases/nano/0D_nano.ogg",
				"He sorprendido a alguien haciendolo."));
		dataBase.add(new Phrase("audio/phrases/nano/0E_nano.ogg",
				"He hecho la sonrisa del payaso."));
		dataBase.add(new Phrase("audio/phrases/nano/0F_nano.ogg",
				"He tenido sexo hoy."));
		dataBase.add(new Phrase("audio/phrases/nano/10_nano.ogg",
				"Me he/Se ha tomado la pildora del dia despues."));
		dataBase.add(new Phrase("audio/phrases/nano/11_nano.ogg",
				"He roto un condon."));
		dataBase.add(new Phrase("audio/phrases/nano/12_nano.ogg",
				"He practicado el sexo viendo anime."));
		dataBase.add(new Phrase("audio/phrases/nano/13_nano.ogg",
				"He tenido sexo en el capo de un coche."));
		dataBase.add(new Phrase("audio/phrases/nano/14_nano.ogg",
				"He tenido sexo en el cuarto de baño de un sitio publico."));
		dataBase.add(new Phrase("audio/phrases/nano/15_nano.ogg",
				"He hecho la marcha atras."));
		dataBase.add(new Phrase("audio/phrases/nano/16_nano.ogg",
				"Me he masturabdo delante de mi pareja."));
		dataBase.add(new Phrase("audio/phrases/nano/17_nano.ogg",
				"He jugado al Yo Nunca."));
		dataBase.add(new Phrase("audio/phrases/nano/18_nano.ogg",
				"He jugado el rol de domidador/dominado."));
		dataBase.add(new Phrase("audio/phrases/nano/19_nano.ogg",
				"He tenido fantasias sexuales fantasticas."));
		dataBase.add(new Phrase("audio/phrases/nano/1A_nano.ogg",
				"He querido poner los cuernos."));
		dataBase.add(new Phrase("audio/phrases/nano/1B_nano.ogg",
				"Me he corrido y no sabia donde."));
		dataBase.add(new Phrase("audio/phrases/nano/1C_nano.ogg",
				"He emborrachado a alguien para tener sexo."));
		dataBase.add(new Phrase("audio/phrases/nano/1D_nano.ogg",
				"Le he pedido la casa a un amigo para tener sexo."));
		dataBase.add(new Phrase("audio/phrases/nano/1E_nano.ogg",
				"He tenido sexo en una boda."));
		dataBase.add(new Phrase("audio/phrases/nano/1F_nano.ogg",
				"He follado sin estar depilado."));
		dataBase.add(new Phrase("audio/phrases/nano/20_nano.ogg",
				"He tenido un orgasmo."));
		dataBase.add(new Phrase("audio/phrases/nano/21_nano.ogg",
				"Me he liado con mas de una persona en 24h."));
		dataBase.add(new Phrase(
				"audio/phrases/nano/22_nano.ogg",
				"Estaria dispuesto a besarme con alguien de este grupo, si es asi, hacerlo ahora mismo."));
		dataBase.add(new Phrase("audio/phrases/nano/23_nano.ogg",
				"He tenido fantasias sexuales con alguien de este grupo."));
		dataBase.add(new Phrase("audio/phrases/nano/24_nano.ogg",
				"He pagado por tener sexo."));
		dataBase.add(new Phrase("audio/phrases/nano/25_nano.ogg",
				"He parado de hacer el amor para ir a mear."));
		dataBase.add(new Phrase("audio/phrases/nano/26_nano.ogg",
				"Se me ha escapado un poco de pis haciendolo."));
		dataBase.add(new Phrase("audio/phrases/nano/27_nano.ogg",
				"He chupado un testiculo."));
		dataBase.add(new Phrase("audio/phrases/nano/28_nano.ogg",
				"Me he aburrido teniendo sexo y me he puesto a \"contar ovejitas\"."));
		dataBase.add(new Phrase("audio/phrases/nano/29_nano.ogg",
				"He/Me han practicado sexo mientras dormia."));
		dataBase.add(new Phrase("audio/phrases/nano/2A_nano.ogg",
				"Me he acordado de algo y me he reido teniendo sexo."));
		dataBase.add(new Phrase("audio/phrases/nano/2B_nano.ogg",
				"Me he olfateado los genitales."));
		dataBase.add(new Phrase("audio/phrases/nano/2C_nano.ogg",
				"He llorado teniendo sexo."));
		
		Collections.shuffle(dataBase, new Random(seed));
	}
	
	public String playNext() {
		long seed = System.nanoTime();
		
		index++;
		if (index > dataBase.size()) {
			index = 0;
			Collections.shuffle(dataBase, new Random(seed));
		}
		
		return replay();
	}
	
	public String replay() {
		dataBase.get(index).play();
		return dataBase.get(index).getMessage();
	}
}
