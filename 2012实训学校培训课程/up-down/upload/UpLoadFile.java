package qjt;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.util.*;
import java.io.*;

public class UpLoadFile {
	public void save(HttpServletRequest request){
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		List items; 
		String dir="d:/";
		try{
			items = upload.parseRequest(request);
			Iterator iter = items.iterator();
			while (iter.hasNext()) {
			    FileItem item = (FileItem) iter.next();
			    if (!item.isFormField()) {
			        String fileName = item.getName();
			        
			        File uploadedFile = new File(dir+fileName);
			        item.write(uploadedFile);
			    }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
