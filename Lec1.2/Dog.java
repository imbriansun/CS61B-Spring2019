public class Dog{
	public int weight;
	
	public Dog(int input_weight){
		weight = input_weight;
	}

	public static Dog maxDog(Dog d1, Dog d2){
		if(d1.weight > d2.weight){
			return d1;
		}
		return d2;
	}

	public void makeNoise(){
		if(this.weight<10){
			System.out.println("yip yip yip!");
		}else if (this.weight < 30){
			System.out.println("bark bark bark!");
		}else{
			System.out.println("woof woof woof");
		}
	}
}
