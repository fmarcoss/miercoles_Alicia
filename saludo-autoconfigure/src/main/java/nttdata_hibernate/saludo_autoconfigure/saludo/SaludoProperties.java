/**
 * 
 */
package nttdata_hibernate.saludo_autoconfigure.saludo;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * @author fmarcoss
 *
 */
@ConfigurationProperties("saludo.mensaje")
@Getter
@Setter
public class SaludoProperties {
	
	private String idioma = "Castellano";

	/**
	 * @return the idioma
	 */
	public String getIdioma() {
		return idioma;
	}

	/**
	 * @param idioma the idioma to set
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}



