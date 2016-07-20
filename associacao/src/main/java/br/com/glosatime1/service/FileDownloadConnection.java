package br.com.glosatime1.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Classe responsável por realizar o download dos arquivos de uma determinada url
 * @author aspira
 *
 */
public class FileDownloadConnection {
	/**
	 * Realiza o download de um arquivo de uma URL para a máquina local
	 * 
	 * @param fileURL Url do arquivo a ser baixado
	 * @param dirDestino Diretório onde será salvo o arquivo
	 * @param fileName Nome que deseja salvar o arquivo
	 * @throws IOException
	 */
	public void downloadFile(String fileURL, String dirDestino, String fileName) throws IOException{
		URL url = new URL(fileURL);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        int responseCode = httpConn.getResponseCode();
        
        if (responseCode == HttpURLConnection.HTTP_OK) {
        	Path path = Paths.get(dirDestino + File.separator + fileName);
            
        	if(Files.exists(path)) Files.delete(path);
        	
            InputStream inputStream = httpConn.getInputStream();
            String saveFilePath = path.toString();
             
            FileOutputStream outputStream = new FileOutputStream(saveFilePath);
 
            int bytesRead = -1;
            byte[] buffer = new byte[4096];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
 
            outputStream.close();
            inputStream.close();
        }
        
        httpConn.disconnect();
	}
}
