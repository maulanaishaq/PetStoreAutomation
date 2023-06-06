package api.payload;

public class Pet {

    int id;
    int categoryId;
    String categoryName;
    String petName;
    String photoUrl;
    int tagsId;
    String tagsName;
    String status;

    public Pet(int id, int categoryId, String categoryName, String petName, String photoUrl, int tagsId, String tagsName, String status) {
        this.id = id;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.petName = petName;
        this.photoUrl = photoUrl;
        this.tagsId = tagsId;
        this.tagsName = tagsName;
        this.status = status;
    }

    public Pet(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getTagsId() {
        return tagsId;
    }

    public void setTagsId(int tagsId) {
        this.tagsId = tagsId;
    }

    public String getTagsName() {
        return tagsName;
    }

    public void setTagsName(String tagsName) {
        this.tagsName = tagsName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
