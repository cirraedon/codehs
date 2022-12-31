public class Comment
{
    ///no user modifications were made to this file.
    
    private String poster;
    private String comment;
    private String date;
    
    public Comment(String poster, String comment, String date)
    {
        this.poster = poster;
        this.comment = comment;
        this.date = date;
    }
    
    public String getPoster() {
        return this.poster;
    }
    
    public String getComment() {
        return this.comment;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public String toString()
    {
        return comment + "\n--" + poster + "(" + date + ")";
    }
}