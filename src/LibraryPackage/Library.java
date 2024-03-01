package src.LibraryPackage;

public class Library 
{
    private static Item[] allItems = new Item[100];
    private static int itemCount = 0;
    
    public void addItem(Item item)
    {
        allItems[itemCount++] = item;

    }

    public void deleteItem(String id)
    {
        for (int i = 0; i < itemCount; i++) {
            if (allItems[i].getID().equals(id)) {
                allItems[i] = null;
                for (int j = i; j < itemCount - 1; j++) {
                    allItems[j] = allItems[j + 1];
                }
                itemCount--;
                break;
            }
        }
    }

    public void changeItemInfo(String id, String newName, String newAuthor, int newYear) {
        for (int i = 0; i < itemCount; i++) {
            if (allItems[i].getID().equals(id)) {
                allItems[i].setName(newName); 
                allItems[i].setAuthor(newAuthor); 
                allItems[i].setYearOfPub(newYear);
                break;
            }
        }
    }

    public void listItemsByCategory(String category) {
        for (int i = 0; i < itemCount; i++) {
            if (allItems[i].getClass().getSimpleName().equalsIgnoreCase(category)) {
                System.out.println(allItems[i]);
            }
        }
    }

    public void printAllItems() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println(allItems[i]);
        }
    }


    
}
