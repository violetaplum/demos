package bookProcess;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import bookProcess.BookVO;

public class BookDAO {
    private ArrayList<Object> alist1;
    private JdbcTemplate jt1;//////////spring자체의 디비 class!!

    public JdbcTemplate getJdbcTemplate() {
        return jt1;
    }

    public void setJdbcTemplate(JdbcTemplate jt1) {
        this.jt1 = jt1;
    }

    public ArrayList<Object> selectAll()  //모두 출력 메소드
    {
        StringBuffer sb1 = new StringBuffer();//문자열의 변화가 많을때
        sb1.append("select * from book");//jt1.query(select문자열,new RowMapper(){메소드})

        //string을 수행하여 resultset에 넣은다음 객체로 꺼내서 arraylist로 넣는 메소드
        alist1 = (ArrayList<Object>) getJdbcTemplate().query
                ( //query : 조회명령어
                        sb1.toString(), new RowMapper<Object>()
                        {
                            public Object mapRow(ResultSet rs1, int joolBun1) throws SQLException
                            {
                                BookVO bv1 = new BookVO();
                                System.out.println("줄번호 = " + joolBun1);
                                bv1.setBookId(rs1.getInt("bookid"));
                                bv1.setBookName(rs1.getString("bookname")); //rs1에서 읽어 VO로
                                bv1.setBookAuthor(rs1.getString("bookauthor"));
                                bv1.setBookCnt(rs1.getInt("bookcnt"));

                                return bv1;
                            }//mapRow()-end
                        }
                );// new RowMapper()-end //query-end
        System.out.println("자료 총 갯수는 " + kajaSoo());
        return alist1;
    }//selectAll()-end
    //만일 rowmapper is not generic error




    public void update1()
    {
        jt1.update("update book set bookcnt=? where bookname=?",new Object[]{"0","전생슬"});//직접 넣는 방식
        //원래는 PreparedStatement쓰고 난리쳐야했었지만
        //그럴 필요없어짐
    }
    public void update1(BookVO bv1)
    {
        jt1.update("update book set tel=? where name=?",new Object[]{bv1.getBookCnt(),bv1.getBookName()});
    }
    public void insert1(BookVO bv1)
    {
        jt1.update("insert into book values(?,?,?,?)",new Object[]{bv1.getBoodId(),bv1.getBookName(),bv1.getBookAuthor(),bv1.getBookCnt()});
    }
    public void delete1(BookVO sv1)
    {
        jt1.update("delete from book where name=?",new Object[]{sv1.getBookName()});
    }

    public void update1(int bookcnt, String name)
    {
        jt1.update("update book set tel=? where name=?",new Object[]{bookcnt,name});
    }

    public void insert1(int id, String name, String author, int cnt)
    {
        jt1.update("insert into book values(?,?,?,?)",new Object[]{id,name,author,cnt});
    }

    public void delete1(String name)
    {
        jt1.update("delete from book where name=?",new Object[]{name});
    }




    public int kajaSoo() {
        //select의 결과가 1개만 나오면 그냥 queryForObject()만 써도 된다.
        //상단의query()와 같은 동작을 하는놈
        int soo = jt1.queryForObject("select count(*) from book", Integer.class);
        //결과가 one row
        return soo;
    }
}
