/**
 * Created by lorenzo on 11-2-15.
 */
public class ScrumItem {

    private int id;
    private String createDate;
    private String creator;

    public ScrumItem(int id, String createDate, String creator) {
        this.id = id;
        this.createDate = createDate;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getCreator() {
        return creator;
    }

    public void calculateTime() {

    }

}
