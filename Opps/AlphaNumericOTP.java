import java.util.Random;

public class AlphaNumericOTP {
    public StringBuilder otpgenerator() 
	{
        int length = 6;  // length of OTP
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < length; i++) 
		{
            otp.append(characters.charAt(random.nextInt(characters.length())));
        }
		return otp;

        
    }
}
