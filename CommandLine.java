class CommandLine
{
	int chk_Arg(String[] arr){
		int l = arr.length;
		return l;
	}

	void find_Vowel(String a,int l)
	{
		a = a.toLowerCase();
		int count=0;
		for(int i=0;i<a.length();i++){
			if(a.charAt(i) == 'a'|| a.charAt(i) == 'e'|| a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
				count+=1;
			}
		}
		System.out.println("Total number of vowel: "+count+". Word number: "+l);
	}

	public static void main(String[] args) {
		CommandLine cmd = new CommandLine();
		int len = cmd.chk_Arg(args);
		if(len>=3)
		{
			for(int i=0;i<len;i++)
			{
				cmd.find_Vowel(args[i],i);
			}
		}
		else{
			System.out.println("\nERROR\nNumber of Argument is less than 3. ");
		}
		System.out.println("\nTotal number of Argument: "+len);
	}
}