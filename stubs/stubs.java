
public class stub {
  

private static void floopThePig(int id, Item it, Class<? extends Item> handlerClass) {
		
		Constructor constructor;
		try {
			constructor = handlerClass.getConstructor(int.class);
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
			return;
		} catch (SecurityException e1) {
			e1.printStackTrace();
			return;
		}

		try {
			it = (Item)
			        constructor.newInstance(id);
		} catch (InstantiationException e) {
			e.printStackTrace();
			return;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return;
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return;
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			return;
		}
		System.out.println(it.itemID);
	}
}
