public class UsernameDanPassword {
          public static void main(String[] args) {
		     // Username dan password asli
	        String usernameAsli = "user124";
	        String passwordAsli = "pass123";

	        // Username dan password yang dimasukkan
	        String usernameInput = "user123";
	        String passwordInput = "pass123";

	        // Lakukan autentikasi
	        if (autentikasi(usernameInput, passwordInput, usernameAsli, passwordAsli)) {
	            System.out.println("Autentikasi Berhasil");
	        } else {
	            System.out.println("Autentikasi Gagal");
	        }
	    }

	    // Metode untuk melakukan autentikasi
	    static boolean autentikasi(String usernameInput, String passwordInput, String usernameValid, String passwordValid) {
	        return usernameInput.equals(usernameValid) && passwordInput.equals(passwordValid);
	    }
	}