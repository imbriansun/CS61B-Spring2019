public class DogLoop{
	public static void main(String[] args){
		Dog smallDog = new Dog(5);
		Dog mediumDog = new Dog(25);
		Dog hugeDog = new Dog(150);

		Dog[] manyDogs = new Dog[4];
		manyDogs[0] = smallDog;
		manyDogs[1] = hugeDog;
		manyDogs[2] = new Dog(130);

		int i = 0;

		while(i < manyDogs.length){
			Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
			i++;
		}
		
	}
}

/*Exception in thread "main" java.lang.NullPointerException
	at Dog.maxDog(Dog.java:9)
	at DogLoop.main(DogLoop.java:15)

 Because of the manyDogs[3] is NULL, 所以有了空指针异常的错误
 */
