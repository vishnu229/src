package main_class;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import movie_class.Movie;
import Movie_attribute.Root;
import Movie_attribute.Root.*;

public class Test {
	public static void convert_TypeA_to_TypeB(File file)
	{
		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(Movie.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Movie movie = (Movie) jaxbUnmarshaller.unmarshal(file);	
			Root root=new Root();
			Root.Movie movie_element=new Root.Movie();
			movie_element.setTitle(movie.getTitle());
			movie_element.setYear(movie.getYear());
			movie_element.setRated(movie.getRated());
			movie_element.setReleased(movie.getReleased());
			movie_element.setRuntime(movie.getRuntime());	
			List<String> genre_list=movie.getGenre().getValue();
			String genre_word="";
			for(int i=0;i<genre_list.size();i++)
			{ 
				genre_word+=genre_list.get(i);	
				if(i!=genre_list.size()-1)
				{
					genre_word+=",";
				}
			}
			movie_element.setGenre(genre_word);
			List<String> director_list=movie.getDirectors().getValue();
			String director_word="";
			for(int i=0;i<director_list.size();i++)
			{ 
				director_word+=director_list.get(i);	
				if(i!=director_list.size()-1)
				{
					director_word+=",";
				}
			}
			movie_element.setDirector(director_word);
			List<String> writer_list=movie.getWriters().getValue();
			String writer_word="";
			for(int i=0;i<writer_list.size();i++)
			{ 
				writer_word+=writer_list.get(i);	
				if(i!=writer_list.size()-1)
				{
					writer_word+=",";
				}
			}			
			movie_element.setWriter(writer_word);
			List<String> actor_list=movie.getActors().getValue();
			String actor_word="";
			for(int i=0;i<actor_list.size();i++)
			{ 
				actor_word+=actor_list.get(i);	
				if(i!=actor_list.size()-1)
				{
					actor_word+=",";
				}
			}	
			movie_element.setActors(actor_word);
			List<String> language_list=movie.getLanguages().getValue();
			String language_word="";
			for(int i=0;i<language_list.size();i++)
			{ 
				language_word+=language_list.get(i);	
				if(i!=language_list.size()-1)
				{
					language_word+=",";
				}
			}
			movie_element.setLanguage(language_word);
			movie_element.setPlot(movie.getPlot());			
			movie_element.setCountry(movie.getCountry());
			movie_element.setAwards(movie.getAwards());
			movie_element.setPoster(movie.getPoster());
			movie_element.setMetascore(movie.getMetascore());
			movie_element.setImdbID(movie.getImdbID());
			movie_element.setImdbRating(movie.getImdbRating());
			movie_element.setImdbVotes(movie.getImdbVotes());
			root.setResponse("True");
			root.setMovie(movie_element);
			JAXBContext jaxbContext1 = JAXBContext.newInstance(Root.class);
			Marshaller jaxbMarshaller = jaxbContext1.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(root, System.out);
		  }
		  catch(Exception e)
		  {
			e.printStackTrace();
		  }
	 }
	public static void convert_TypeB_to_TypeA(File file)
	{
		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Root root = (Root) jaxbUnmarshaller.unmarshal(file);
			Movie movie=new Movie();
			Movie.Genre genre=new Movie.Genre();
			Movie.Directors director=new Movie.Directors();			
			Movie.Writers writer=new Movie.Writers();
			Movie.Actors actor=new Movie.Actors();
			Movie.Languages language=new Movie.Languages();
			movie.setTitle(root.getMovie().getTitle());
			movie.setYear(root.getMovie().getYear());
			movie.setRated(root.getMovie().getRated());
			movie.setReleased(root.getMovie().getReleased());
			movie.setRuntime(root.getMovie().getRuntime());
			genre.setValue(root.getMovie().getGenre());
			movie.setGenre(genre);
			director.setValue(root.getMovie().getDirector());
			movie.setDirectors(director);	
			writer.setValue(root.getMovie().getWriter());
			movie.setWriters(writer);
			actor.setValue(root.getMovie().getActors());
			movie.setActors(actor);
			language.setValue(root.getMovie().getLanguage());
			movie.setLanguages(language);
			movie.setPlot(root.getMovie().getPlot());
			movie.setCountry(root.getMovie().getCountry());
			movie.setAwards(root.getMovie().getAwards());
			movie.setPoster(root.getMovie().getPoster());
			movie.setMetascore(root.getMovie().getMetascore());
			movie.setImdbRating(root.getMovie().getImdbRating());
			movie.setImdbVotes(root.getMovie().getImdbVotes());
			movie.setImdbID(root.getMovie().getImdbID());
			JAXBContext jaxbContext1 = JAXBContext.newInstance(Movie.class);
			Marshaller jaxbMarshaller = jaxbContext1.createMarshaller();
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(movie, System.out);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {

	 try{

		File file = new File("C:\\Users\\vishng\\Desktop\\file.xml");			
		convert_TypeA_to_TypeB(file);		
		File file1 = new File("C:\\Users\\vishng\\Desktop\\file1.xml");
		convert_TypeB_to_TypeA(file1);	    

	  } catch (Exception e) {
		e.printStackTrace();
	  }

	}
}

