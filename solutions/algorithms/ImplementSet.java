package practise.com;

import java.util.ArrayList;
import java.util.List;

public class ImplementSet {
	public static void main(String args[]){
		SetF v1 = new SetF();
		v1 .add(4);
		v1.add(10);
		v1 .add(4);
		v1 .add(41);
		v1.display();
		v1.delete(41);
		v1.display();
		
		
		
	}

}

class SetF{
	ArrayList<Integer> store;
	public SetF(){
		this.store = new ArrayList<Integer>();
	}
	public void add(int a){
		if(!store.contains(a))
			store.add(a);
	}
	public void delete(int a){
		
		if(store.contains(a)){
		for(int i=0; i< store.size(); i++){
			if(store.get(i) == a)
				store.remove(i);
		}
		}
	}
	public boolean isPresent(int a){
		if (store.contains(a))
				return true;
		else
			return false;
	}
	public void display(){
		for(int a: store)
				System.out.print(a+" " );
	}
}
