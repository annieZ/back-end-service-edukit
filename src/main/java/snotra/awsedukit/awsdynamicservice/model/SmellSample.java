package snotra.awsedukit.awsdynamicservice.model;

import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "SmellSamples")
public class SmellSample {

	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	String smell_id;
	
	@DynamoDBAttribute
	Date submissionDate;
	
	@DynamoDBAttribute
	String sumittedSmellType;
	
	@DynamoDBAttribute
	String recognizedSmellType;
	
	@DynamoDBAttribute
	long tvoc;
		
	@DynamoDBAttribute
	long eCO2;
	
	@DynamoDBAttribute
	GeoIP location;
	
	@DynamoDBAttribute
	String submitter;
	
	@DynamoDBAttribute
	String tempertureInF;
	
	@DynamoDBAttribute
	String humidity;
	
	@DynamoDBAttribute
	String matchedProbability;

}
