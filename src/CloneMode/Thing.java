package CloneMode;

import java.util.ArrayList;

/**
 * @author: bxguo
 * @time: 2019/1/2 11:47
 */
public class Thing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<>();
    private String name;

    @Override
    public Thing clone(){
        Thing clone = null;
        try {
            clone = (Thing) super.clone();
            clone.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public ArrayList<String> getValue() {
        return arrayList;
    }

    public void setValue(String str) {
        this.arrayList.add(str);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
