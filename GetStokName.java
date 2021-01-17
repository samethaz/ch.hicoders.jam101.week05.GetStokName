import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class GetStokName
{
    public GetStokName()
    {
    }
    public String GetStokName(String S)
    {
        S = S.toUpperCase();
        S = S.trim();
        S = GetReverse(S);
        S = RemoveNumber(S);
        S = AddHeader(S);
        return AdDate(S);
    }
    public String GetReverse(String S)
    {
        StringBuffer a = new StringBuffer(S);

    return  a.reverse().toString();
    }
    public String RemoveNumber(String S)
    {
    return  S.replaceAll("\\d","");
    }
    public String AdDate(String S)
    {
        LocalDate L = LocalDate.now();
        return  S+L.toString().replaceAll("-","");
    }
    public String AddHeader(String S)
    {
    return "ASLIAG_"+S;
    }
}
