//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.04 at 08:17:06 PM IST 
//


package movie_class;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the movie_class package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: movie_class
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Movie.Genre }
     * 
     */
    public Movie.Genre createMovieGenre() {
        return new Movie.Genre();
    }

    /**
     * Create an instance of {@link Movie.Directors }
     * 
     */
    public Movie.Directors createMovieDirectors() {
        return new Movie.Directors();
    }

    /**
     * Create an instance of {@link Movie.Writers }
     * 
     */
    public Movie.Writers createMovieWriters() {
        return new Movie.Writers();
    }

    /**
     * Create an instance of {@link Movie.Actors }
     * 
     */
    public Movie.Actors createMovieActors() {
        return new Movie.Actors();
    }

    /**
     * Create an instance of {@link Movie.Languages }
     * 
     */
    public Movie.Languages createMovieLanguages() {
        return new Movie.Languages();
    }

}