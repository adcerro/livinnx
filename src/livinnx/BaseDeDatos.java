package livinnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class BaseDeDatos {
    /**
     * This method gives access to the database file
     *@param databaseLocation the filepath of the database file
     */
    public Connection connection( String databaseLocation)
    {
       try
       {
           Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
          Connection result = DriverManager.getConnection("jdbc:ucanaccess://"+databaseLocation);
          System.out.println("CONNECTED");
          return result;
        }
        catch(Exception e)
        { System.out.println("la excepcion fue: "+e);
          return null;
        }


    }
    /**
     *This method looks for a matching entry in the database and returns the desired information from that entry
     *@param x Connection established with the database
     *@param query String with the information from the desired entry in the database
     *@param results Array of found/expected to be found results
     *@param m DefautlTableModel with the format expected for the results
     *@return m DefautlTableModel with the desired information
     */
    public DefaultTableModel SEARCH(Connection x,String query,String results[],DefaultTableModel m)
    {    ResultSet s=null;
         Statement st;


         try
         {
            st=x.createStatement();
            s=st.executeQuery(query);

            while(s.next())
            {
                for(int i = 0; i<results.length; i++)
                {
                    results[i]=s.getString(i+1);
                }
                m.addRow(results);
            }

         }
        catch(Exception e)
        {
            System.out.println(e);
        }
         return m;
    }
    /**
     * This method allows to add/edit/delete and entry with the given information
     * @param x  Connection established with the database
     * @param query String with the desired operation and information of the desired entry 
     */
    public void add_edit_delete(Connection x, String query)
    {   Statement st;

        try
        {
            st=x.createStatement();
            st.executeUpdate(query);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
