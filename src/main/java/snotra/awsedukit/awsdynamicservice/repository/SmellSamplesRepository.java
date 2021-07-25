package snotra.awsedukit.awsdynamicservice.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import lombok.extern.slf4j.Slf4j;
import snotra.awsedukit.awsdynamicservice.config.DynamoDbConfiguration;
import snotra.awsedukit.awsdynamicservice.model.SmellSample;

@Repository
@Slf4j
public class SmellSamplesRepository {
	
	@Autowired
	private DynamoDBMapper dynamoDBMapper;
	
	@Autowired
	DynamoDbConfiguration dynamoDbConfiguration;
	
	@PostConstruct
	public void setupConfirm()
	{
		log.info("Database config: {}", dynamoDbConfiguration.toString());
	}
	public SmellSample save (SmellSample smellSample)
	{
		dynamoDBMapper.save(smellSample);
		return smellSample;
	}

		

}
