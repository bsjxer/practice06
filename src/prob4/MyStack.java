package prob4;

public class MyStack implements Stack {
	static int count = 0;
	static String[] box = new String[10]; 
	
	public MyStack( int w ){
		box = new String[w];
	}
	
	
	@Override
	public void push(String item) {
		if( size() == count){						// 저장 공간이 다 찬 경우 
			String[] temp = new String[box.length];	// 기존 정보를 담을 temp공간 생성
			
			for(int i = 0; i < box.length; i++ ){
				temp[i] = box[i];
			}
			
			box = new String[2*box.length];			// 확장된 공간 생성
			
			for(int i = 0 ; i < temp.length; i++ ){	// 기존 정보를 확장 공간에 저장
				box[i] = temp[i];
			}
			
		}
		
		box[count] = item;
		count++;
		
	}

	@Override
	public String pop() throws MyStackException {
		if(count == 0) {
			throw new MyStackException();
		}
		return box[--count];
	}

	@Override
	public boolean isEmpty() {
		if( count == 0){
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return box.length;
	}

}
