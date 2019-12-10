package consoleInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {

	/**
	 * Con las funciones que hay en estas clases podremos controlar las excepciones que ocurren
	 * al introducir un dato a traves del teclado
	 * 
	 * 
	 * @author AndreiSzA
	 * @version 1.0
	 * @since 1.0
	 */
	private final Scanner keyboard;

	
	public ConsoleInput(Scanner keyboard) {

		this.keyboard = keyboard;
		
	}

	private void cleanInput() {

		keyboard.nextLine();

	}


	/**
	 * Devuelve un byte introducido por el usuario y si el usuario 
	 * no introduce un byte se le volvería a pedir
	 * @return El byte que el usuario ha introducido
	 * @author AndreiSzA
	 * @version 1.0
	 * @since 1.0.
	 */
	
	
	public byte readByte() {

		byte introduced = 0;
		boolean error = false;
	
		do {
			try {
				System.out.println("Introduce un Byte");
				introduced= keyboard.nextByte();
				error = false;
			}
			catch (InputMismatchException e) {
				System.out.println("No has introducido un bite");
				error=true;
			}
			finally {
				cleanInput();
			}
		
		} while(error);
	
		return introduced;
	}
	
	/**
	 * Devuelve un byte introducido por el usuario pero menor
	 * que el parametro upperBound. En el caso de que el byte sea mayor que el parametro o el
	 * usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readByte()
 	 */
	
 	public byte readByteLessThan (byte upperBound) {
 		byte introduced;
 		do {
 			introduced=readByte();
 		} while(introduced>upperBound);
 		
 		return introduced;
 	}

 	/**
	 * Devuelve un byte introducido por el usuario pero menor
	 * o igual que el parametro upperBound. En el caso de que el byte sea mayor que el parametro o el
	 * usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readByte()
 	 */
 	
 	
 	
 	public byte readByteLessOrEqualThan(byte upperBound) {
 		
 		byte introduced;
 		do {
 			introduced=readByte();
 		} while(introduced>=upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un byte introducido por el usuario pero mayor
	 * que el parametro upperBound. En el caso de que el byte sea mayor que el parametro o el
	 * usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readByte()
 	 */
	
 	public byte readByteGreaterThan(byte lowerBound) {
 		byte introduced;
 		do {
 			introduced=readByte();
 		} while(introduced<lowerBound);
 		
 		return introduced;
 	}
 	
 	/**
	 * Devuelve un byte introducido por el usuario pero mayor
	 * o igual que el parametro upperBound. En el caso de que el byte sea mayor que el parametro o el
	 * usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readByte()
 	 */
 	public byte readByteGreaterOrEqualThan(byte lowerBound) {
 		byte introduced;
 		do {
 			introduced=readByte();
 		} while(introduced<=lowerBound);
 		
 		return introduced;
 		
 	}
	
 	/**
	 * Devuelve un byte introducido por el usuario que
	 * este en el rango indicado. En el caso de que el byte este fuera del rango que 
	 * se indica en los parametros ambos incluidos o el usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readByte()
 	 */
	
	
 	public byte readByteInRangeInclusive(byte lowerBound, byte upperBound) {
 		
 		byte introduced;
 		do {
 			introduced=readByte();
 		} while(introduced<lowerBound || introduced>upperBound);
 		
 		return introduced;
 	}
	
 	/**
	 * Devuelve un byte introducido por el usuario que
	 * este en el rango indicado. En el caso de que el byte este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readByte()
 	 */
 	
 	public byte readByteInRangeExclusive(byte lowerBound, byte upperBound) {
 		
 		byte introduced;
 		do {
 			introduced=readByte();
 		} while(introduced<=lowerBound || introduced>=upperBound);
 		
 		return introduced;
 	}
 		
 		//----------------------------------------------------------SHORT-------------------------------------------------------------------------------------
 	
	/**
	 * Devuelve un short introducido por el usuario y si el usuario 
	 * no introduce un short se le volvería a pedir
	 * @return El short que el usuario ha introducido
	 * @author AndreiSzA
	 * @version 1.0
	 * @since 1.0.
	 */
 	
 	public short readShort() {

		short introduced = 0;
		boolean error = false;
	
		do {
			try {
				System.out.println("Introduce un Short");
				introduced= keyboard.nextShort();
				error = false;
			}
			catch (InputMismatchException e) {
				System.out.println("No has introducido un Short");
			}
			finally {
				cleanInput();
			}
		
		} while(error);
	
		return introduced;
	}

	/**
	 * Devuelve un short introducido por el usuario pero menor
	 * que el parametro upperBound. En el caso de que el short sea mayor que el parametro o el
	 * usuario no introduce un short se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El short introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readshort()
 	 */
 	public short readShortLessThan (short upperBound) {
 		short introduced;
 		do {
 			introduced=readShort();
 		} while(introduced>upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un short introducido por el usuario pero menor
	 * o igual que el parametro upperBound. En el caso de que el short sea mayor que el parametro o el
	 * usuario no introduce un short se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El short introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readShort()
 	 */
 	public short readShortLessOrEqualThan(short upperBound) {
 		
 		short introduced;
 		do {
 			introduced=readShort();
 		} while(introduced>=upperBound);
 		
 		return introduced;
 	}
	
 	/**
	 * Devuelve un short introducido por el usuario pero mayor
	 * que el parametro upperBound. En el caso de que el short sea mayor que el parametro o el
	 * usuario no introduce un short se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El short introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readShort()
 	 */
	
 	public short readShortGreaterThan(short lowerBound) {
 		short introduced;
 		do {
 			introduced=readShort();
 		} while(introduced<lowerBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un short introducido por el usuario pero mayor
	 * o igual que el parametro upperBound. En el caso de que el short sea mayor que el parametro o el
	 * usuario no introduce un short se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El short introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readShort()
 	 */
 	public short readShortGreaterOrEqualThan(short lowerBound) {
 		short introduced;
 		do {
 			introduced=readShort();
 		} while(introduced<=lowerBound);
 		
 		return introduced;
 		
 	}
	
	
 	/**
	 * Devuelve un short introducido por el usuario que
	 * este en el rango indicado. En el caso de que el short este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un short se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El short introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readShort()
 	 */
	
 	public short readShortInRangeInclusive(short lowerBound, short upperBound) {
 		
 		short introduced;
 		do {
 			introduced=readShort();
 		} while(introduced<lowerBound || introduced>upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un short introducido por el usuario que
	 * este en el rango indicado. En el caso de que el short este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un short se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El short introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readShort()
 	 */
 	public short readSyteInRangeExclusive(short lowerBound, short upperBound) {
 		
 		short introduced;
 		do {
 			introduced=readShort();
 		} while(introduced<=lowerBound || introduced>=upperBound);
 		
 		return introduced;
 	}
 	
 	
 	//-----------------------------------------------------------------------------------INT---------------------------------------------------------------------------------------------
 	
 	
 	/**
	 * Devuelve un int introducido por el usuario y si el usuario 
	 * no introduce un int se le volvería a pedir
	 * @return El int que el usuario ha introducido
	 * @author AndreiSzA
	 * @version 1.0
	 * @since 1.0.
	 */
 	
 	public int readInt() {

		int introduced = 0;
		boolean error = false;
	
		do {
			try {
				System.out.println("Introduce un Int");
				introduced= keyboard.nextInt();
				error = false;
			}
			catch (InputMismatchException e) {
				System.out.println("No has introducido un Int");
			}
			finally {
				cleanInput();
			}
		
		} while(error);
	
		return introduced;
	}
	

	/**
	 * Devuelve un int introducido por el usuario pero menor
	 * que el parametro upperBound. En el caso de que el int sea mayor que el parametro o el
	 * usuario no introduce un int se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El int introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readInt()
 	 */
 	
 	public int readIntLessThan (int upperBound) {
 		int introduced;
 		do {
 			introduced=readInt();
 		} while(introduced>upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un int introducido por el usuario pero menor
	 * o igual que el parametro upperBound. En el caso de que el int sea mayor que el parametro o el
	 * usuario no introduce un int se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El int introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readInt()
 	 */
 	public int readIntLessOrEqualThan(int upperBound) {
 		
 		int introduced;
 		do {
 			introduced=readInt();
 		} while(introduced>=upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un int introducido por el usuario pero mayor
	 * que el parametro upperBound. En el caso de que el int sea mayor que el parametro o el
	 * usuario no introduce un int se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El int introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readInt()
 	 */
	
	
 	public int readIntGreaterThan(int lowerBound) {
 		int introduced;
 		do {
 			introduced=readInt();
 		} while(introduced<lowerBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un int introducido por el usuario pero mayor
	 * o igual que el parametro upperBound. En el caso de que el int sea mayor que el parametro o el
	 * usuario no introduce un int se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El int introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readInt()
 	 */
 	public int readIntGreaterOrEqualThan(int lowerBound) {
 		int introduced;
 		do {
 			introduced=readInt();
 		} while(introduced<=lowerBound);
 		
 		return introduced;
 		
 	}
	
	
 	/**
	 * Devuelve un int introducido por el usuario que
	 * este en el rango indicado. En el caso de que el int este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un int se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El int introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readInt()
 	 */
	
 	public int readIntInRangeInclusive(int lowerBound, int upperBound) {
 		
 		int introduced;
 		do {
 			introduced=readInt();
 		} while(introduced<lowerBound || introduced>upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un int introducido por el usuario que
	 * este en el rango indicado. En el caso de que el int este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un int se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El int introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readInt()
 	 */
 	public int readIntInRangeExclusive(int lowerBound, int upperBound) {
 		
 		int introduced;
 		do {
 			introduced=readInt();
 		} while(introduced<=lowerBound || introduced>=upperBound);
 		
 		return introduced;
 	}
 	
 	
 	
 	
 	//--------------------------------------------------------------------------------------------LONG-----------------------------------------------------------------------------------
 	
	/**
	 * Devuelve un long introducido por el usuario y si el usuario 
	 * no introduce un long se le volvería a pedir
	 * @return El long que el usuario ha introducido
	 * @author AndreiSzA
	 * @version 1.0
	 * @since 1.0.
	 */
 	
 	public long readLong() {

		long introduced = 0;
		boolean error = false;
	
		do {
			try {
				System.out.println("Introduce un Long");
				introduced= keyboard.nextLong();
				error = false;
			}
			catch (InputMismatchException e) {
				System.out.println("No has introducido un Long");
			}
			finally {
				cleanInput();
			}
		
		} while(error);
	
		return introduced;
	}

	/**
	 * Devuelve un long introducido por el usuario pero menor
	 * que el parametro upperBound. En el caso de que el long sea mayor que el parametro o el
	 * usuario no introduce un long se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El long introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readLong()
 	 */
 	public long readLongLessThan (long upperBound) {
 		long introduced;
 		do {
 			introduced=readLong();
 		} while(introduced>upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un long introducido por el usuario pero menor
	 * o igual que el parametro upperBound. En el caso de que el long sea mayor que el parametro o el
	 * usuario no introduce un long se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El long introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readLong()
 	 */
 	public long readLongLessOrEqualThan(long upperBound) {
 		
 		long introduced;
 		do {
 			introduced=readLong();
 		} while(introduced>=upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un long introducido por el usuario pero mayor
	 * que el parametro upperBound. En el caso de que el long sea mayor que el parametro o el
	 * usuario no introduce un long se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El long introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readLong()
 	 */
	
	
 	public long readLongGreaterThan(long lowerBound) {
 		long introduced;
 		do {
 			introduced=readLong();
 		} while(introduced<lowerBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un long introducido por el usuario pero mayor
	 * o igual que el parametro upperBound. En el caso de que el long sea mayor que el parametro o el
	 * usuario no introduce un long se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El long introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readLong()
 	 */
 	public long readLongGreaterOrEqualThan(long lowerBound) {
 		long introduced;
 		do {
 			introduced=readLong();
 		} while(introduced<=lowerBound);
 		
 		return introduced;
 		
 	}
	
	
 	/**
	 * Devuelve un long introducido por el usuario que
	 * este en el rango indicado. En el caso de que el long este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un long se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El long introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readLong()
 	 */
	
 	public long readLongInRangeInclusive(long lowerBound, long upperBound) {
 		
 		long introduced;
 		do {
 			introduced=readLong();
 		} while(introduced<lowerBound || introduced>upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un long introducido por el usuario que
	 * este en el rango indicado. En el caso de que el long este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un long se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El long introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readLong()
 	 */
 	public long readLongInRangeExclusive(long lowerBound, long upperBound) {
 		
 		long introduced;
 		do {
 			introduced=readLong();
 		} while(introduced<=lowerBound || introduced>=upperBound);
 		
 		return introduced;
 	}
 	
 	
 	
 	//------------------------------------------------------------------------------------FLOAT---------------------------------------------------------------------------------
 	
 	/**
	 * Devuelve un float introducido por el usuario y si el usuario 
	 * no introduce un float se le volvería a pedir
	 * @return El float que el usuario ha introducido
	 * @author AndreiSzA
	 * @version 1.0
	 * @since 1.0.
	 */
 	
 	public float readFloat() {

 		float introduced = 0;
		boolean error = false;
	
		do {
			try {
				System.out.println("Introduce un float");
				introduced= keyboard.nextFloat();
				error = false;
			}
			catch (InputMismatchException e) {
				System.out.println("No has introducido un float");
			}
			finally {
				cleanInput();
			}
		
		} while(error);
	
		return introduced;
	}

	/**
	 * Devuelve un float introducido por el usuario pero menor
	 * que el parametro upperBound. En el caso de que el float sea mayor que el parametro o el
	 * usuario no introduce un float se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El float introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readFloat()
 	 */
 	public float readFloatLessThan (float upperBound) {
 		float introduced;
 		do {
 			introduced=readFloat();
 		} while(introduced>upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un float introducido por el usuario pero menor
	 * o igual que el parametro upperBound. En el caso de que el float sea mayor que el parametro o el
	 * usuario no introduce un float se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El float introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readFloat()
 	 */
 	public float readFloatLessOrEqualThan(float upperBound) {
 		
 		float introduced;
 		do {
 			introduced=readFloat();
 		} while(introduced>=upperBound);
 		
 		return introduced;
 	}
	
 	/**
	 * Devuelve un float introducido por el usuario pero mayor
	 * que el parametro upperBound. En el caso de que el float sea mayor que el parametro o el
	 * usuario no introduce un float se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El float introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readFloat()
 	 */
	
 	public float readFloatGreaterThan(float lowerBound) {
 		float introduced;
 		do {
 			introduced=readFloat();
 		} while(introduced<lowerBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un float introducido por el usuario pero mayor
	 * o igual que el parametro upperBound. En el caso de que el float sea mayor que el parametro o el
	 * usuario no introduce un float se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El float introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readFloat()
 	 */
 	public float readFloatGreaterOrEqualThan(float lowerBound) {
 		float introduced;
 		do {
 			introduced=readFloat();
 		} while(introduced<=lowerBound);
 		
 		return introduced;
 		
 	}
 	/**
	 * Devuelve un float introducido por el usuario que
	 * este en el rango indicado. En el caso de que el float este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un float se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El float introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readFloat()
 	 */
	
	
	
 	public float readFloatInRangeInclusive(float lowerBound, float upperBound) {
 		
 		float introduced;
 		do {
 			introduced=readFloat();
 		} while(introduced<lowerBound || introduced>upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un float introducido por el usuario que
	 * este en el rango indicado. En el caso de que el float este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un float se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El float introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readFloat()
 	 */
 	public float readFloatInRangeExclusive(float lowerBound, float upperBound) {
 		
 		float introduced;
 		do {
 			introduced=readFloat();
 		} while(introduced<=lowerBound || introduced>=upperBound);
 		
 		return introduced;
 	}
 	
 	
 	//---------------------------------------------------------------------------------------------------DOUBLE----------------------------------------------------------------------------------------------------
 	/**
	 * Devuelve un byte introducido por el usuario y si el usuario 
	 * no introduce un byte se le volvería a pedir
	 * @return El byte que el usuario ha introducido
	 * @author AndreiSzA
	 * @version 1.0
	 * @since 1.0.
	 */
 	
 	public double readDouble() {

 		double introduced = 0;
		boolean error = false;
	
		do {
			try {
				System.out.println("Introduce un double");
				introduced= keyboard.nextDouble();
				error = false;
			}
			catch (InputMismatchException e) {
				System.out.println("No has introducido un double");
			}
			finally {
				cleanInput();
			}
		
		} while(error);
	
		return introduced;
	}

	/**
	 * Devuelve un byte introducido por el usuario pero menor
	 * que el parametro upperBound. En el caso de que el byte sea mayor que el parametro o el
	 * usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readDouble()
 	 */
 	public double readDoubleLessThan (double upperBound) {
 		double introduced;
 		do {
 			introduced=readDouble();
 		} while(introduced>upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un byte introducido por el usuario pero menor
	 * o igual que el parametro upperBound. En el caso de que el byte sea mayor que el parametro o el
	 * usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readDouble()
 	 */
 	public double readDoubleLessOrEqualThan(double upperBound) {
 		
 		double introduced;
 		do {
 			introduced=readDouble();
 		} while(introduced>=upperBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un byte introducido por el usuario pero mayor
	 * que el parametro upperBound. En el caso de que el byte sea mayor que el parametro o el
	 * usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readDouble()
 	 */
	
	
 	public double readDoubleGreaterThan(double lowerBound) {
 		double introduced;
 		do {
 			introduced=readDouble();
 		} while(introduced<lowerBound);
 		
 		return introduced;
 	}
 	/**
	 * Devuelve un byte introducido por el usuario pero mayor
	 * o igual que el parametro upperBound. En el caso de que el byte sea mayor que el parametro o el
	 * usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readDouble()
 	 */
 	public double readDoubleGreaterOrEqualThan(double lowerBound) {
 		double introduced;
 		do {
 			introduced=readDouble();
 		} while(introduced<=lowerBound);
 		
 		return introduced;
 		
 	}
	
 	/**
	 * Devuelve un byte introducido por el usuario que
	 * este en el rango indicado. En el caso de que el byte este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readDouble()
 	 */
	
	
 	public double readDoubleInRangeInclusive(double lowerBound, double upperBound) {
 		
 		double introduced;
 		do {
 			introduced=readDouble();
 		} while(introduced<lowerBound || introduced>upperBound);
 		
 		return introduced;
 	}
 	
 	/**
	 * Devuelve un byte introducido por el usuario que
	 * este en el rango indicado. En el caso de que el byte este fuera del rango que 
	 * se indica en los parametros ambos excluidos o el usuario no introduce un byte se le volveria a pedir.
	 * @param upperBound lowerBound Paramentro con el que se comparará el digito introducido por el usuario
	 * @return El byte introducito por el usuario
	 * @version 1.0
	 * @since 1.0
	 * @see readDouble()
 	 */
	
 	public double readDoubleInRangeExclusive(double lowerBound, double upperBound) {
 		
 		double introduced;
 		do {
 			introduced=readDouble();
 		} while(introduced<=lowerBound || introduced>=upperBound);
 		
 		return introduced;
 	}
 	
 	
 	//-------------------------------------------------------------------CHAR--------------------------------------------------------------------------------
 	
 	
 	/**
 	 * Devuelve el caracter introducido por el usuario y
 	 * si hay más de un caracter se le vuelve a pedir
 	 * 
 	 * 
 	 * @return El char introducido por el usuario
 	 * @version 1.0
 	 * @since 1.0
 	 */
 	
 	public char readChar() {
 		
 		String string;
 		char c;
 		
 		do {
 			string = keyboard.nextLine();
 		}while(string.length()>1);
 		
 		c = string.charAt(0);
 		
 		return c;
 		
 	}
 	
 	/**
 	 * Devuelve un caracter introducido por el usuario
 	 * y el parametro validCharacters contiene los caracteres validos
 	 * 
 	 * 
 	 * @param validCharacters Cadena con los caracteres validos
 	 * @return El caracter introducido por el usuario
 	 * @version 1.0
 	 * @since 1.0
 	 * @see readChar()
 	 * 
 	 */
 	
 	public char readChar(String validCharacters) {
 		char  introduced;
 		int cont;
 		boolean valid = false;
 		do {
 			introduced = readChar();
 			
 			for(cont = 0; cont <= validCharacters.length() - 1; cont++ ) {
 				
 				if(introduced == validCharacters.charAt(cont)) {
 					
 					valid = true;
 					
 				}	
 			}			
 		}while(!valid);
 		
 		return introduced;
 	}
 	
 	/**
 	 * Devuelve una vocal introducida por el usuario. Si no se introduce
 	 * una vocal se le vuelve a solicitar-
 	 * 
 	 * @return La vocal introducida por el usuario
 	 * @version 1.0
 	 * @since 1.0
 	 * @see readChar
 	 */
 	
 	
 	
 	public char readVowel() {
		char introduced;
		introduced = readChar("aeiouAEIOU");

		return introduced;

	}
 	
 	/**
 	 * 
 	 * Devuelve un digito introducido por el usuario. Si no es un digito
 	 * se le vuelve a solicitar.
 	 * 
 	 * @return El digito introducido por el usuario
 	 * @version 1.0
 	 * @since 1.0
 	 * @see readChar
 	 */
 	
 	
 	public char readDigit() {
		char introduced;
		boolean valid;
		do {
			introduced = readChar();
			valid = Character.isDigit(introduced);
		} while (!valid);

		return introduced;
	}

 	/**
 	 * Devuelve un caracter introducido por el usuario, si no 
 	 * es en minusculas se le vuelve a solicitar
 	 * 
 	 * 
 	 * @return devuelve un caracter en minusculas
 	 * @version 1.0
 	 * @since 1.0
 	 * @see readChar
 	 */
 	public char readLowerCase() {
		String string;
		char introduced;
		do {
			introduced = readChar();
			string = Character.toString(introduced);
		} while (!string.equals(string.toLowerCase()));
	
		introduced = string.charAt(0);

		return introduced;
	}
 	/**
 	 *  devuelve un caracter introducido por el usuario, si no 
 	 * es en mayusculas se le vuelve a solicitar
 	 * 
 	 * 
 	 * @return devuelve un caracter en mayusculas
 	 * @version 1.0
 	 * @since 1.0
 	 * @see readChar
 	 */
 	
 	public char readUpperCase() {
		String string;
		char introduced;
		do {
			introduced = readChar();
			string = Character.toString(introduced);
		} while (string.equals(string.toLowerCase()));
		introduced = string.charAt(0);

		return introduced;
	}
 	
 	
 	//----------------------------------------------------------------------STRING-----------------------------------------------------------------------
 	
 	/**
 	 * Devuelve la cadena introducido por el usuario.
 	 * 
 	 * @return La cadena introducida por el usuario
 	 * @version 1.0
 	 * @since 1.0
 	 */
 	public String readString() {
		String string;
		
		string = keyboard.nextLine();
		
		return string;
	}
 	
 	/**
 	 * Devuelve una cadena introducida por el usuario pero con un numero
 	 * maximo de caracteres indicado por el parametro maxLength y si es
 	 * mayor que ese parametro se le vuelve a pedir
 	 * 
 	 * @param maxLength
 	 * @return La cadena introducida por el usuario
 	 * @version 1.0
 	 * @since 1.0
 	 * @see readString()
 	 */
 	
 	public String readString(int maxLength) {
		String string;
		do {
			string = readString();
		} while (string.length() > maxLength);
		return string;
	
 	}
 	//-----------------------------------------------------------------BOOLEAN--------------------------------------------------
 	
 	/**
 	 *  Devuelve true/false en función de si el caracter introducido coincide
 	 * con el affirmativeValue. Si coincide se devuelve true y si no se devuelve false.
 	 * 
 	 * 
 	 * @version 1.0
 	 * @since 1.0
 	 * @param affirmativeValue
 	 * @return True o False 
 	 * @see readChar
 	 */
		
		public boolean readBooleanUsingChar(char affirmativeValue) {
			
			String introduced_string = Character.toString(Character.toLowerCase(readChar()));
			String correct_string = Character.toString(Character.toLowerCase(affirmativeValue));
			boolean result =false;
			
			
			if(introduced_string.equals(correct_string)) {
				
				result =true;
			}
			
			return result;
		
		}
		
		/**
	 	 * Devuelve true/false en función de si el caracter introducido coincide
	 	 * con Ss o Nn. Si coincide con S o s se devuelve true y si no se devuelve false.
	 	 * 
	 	 * 
	 	 * @version 1.0
	 	 * @since 1.0
	 	 * @param affirmativeValue
	 	 * @return True o False 
	 	 * @see readChar
	 	 */
		public boolean readBooleanUsingChar() {
			
			
			char introduced = readChar("SsNn");
			boolean result =false;
			
			
			if(introduced == 'S' || introduced == 's') {
				
				result=true;
			}
			
			return result;
			
			
		}
		
		/**
	 	 *  Devuelve true/false en función de si el número introducido coincide
	 	 * con el affirmativeValue. Si coincide se devuelve true y si no se devuelve false.
	 	 * 
	 	 * 
	 	 * @version 1.0
	 	 * @since 1.0
	 	 * @param affirmativeValue
	 	 * @return True o False 
	 	 * @see readChar
	 	 */
		
		public boolean readBooleanUsingInt(int affirmativeValue) {
			
			int introduced_int = readInt();
			boolean result= false;
			
			if( introduced_int == affirmativeValue) {
				
				result = true;
				
			}
			return result;
			
		}
	
		/**
	 	 * Devuelve true/false en función de si el caracter introducido coincide
	 	 * con 1. Si coincide con 1 se devuelve true y si no se devuelve false.
	 	 * 
	 	 * 
	 	 * @version 1.0
	 	 * @since 1.0
	 	 * @param affirmativeValue
	 	 * @return True o False 
	 	 * @see readChar
	 	 */
		
		public boolean readBooleanUsingInt() {
			int introduced_int= readInt();
			boolean result = false;
			
			if(introduced_int == 1) {
				
				result = true;
			}
			return result;
		}
		
 	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
