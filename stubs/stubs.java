
public class stub {
  

private static void foo(int id, Item it, Class<? extends Item> handlerClass) {
	
	/* ClientProxy doesn't like this method hence it throws a NullPointer due to the item not being declared?*/
	
		/* access the class which is the handler*/
		Constructor constructor;
		try {
			/* Get constructor params*/
			constructor = handlerClass.getConstructor(int.class);
		} catch (NoSuchMethodException e1) {
			e1.printStackTrace();
			return;
		} catch (SecurityException e1) {
			e1.printStackTrace();
			return;
		}

		try {
			/* Set constructors params with item id*/
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
		/* prints declared item ID which is successful...*/
		System.out.println(it.itemID);
	}
}
