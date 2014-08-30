File.open(ARGV[0]).each_line do |line|
	nums = line.split(" ")
	for i in 1..nums[2].to_i
		if i % nums[0].to_i == 0 && i % nums[1].to_i == 0
			print "FB"
		elsif i % nums[1].to_i == 0
			print "B"
		elsif i % nums[0].to_i == 0
			print "F"
		else
			print i
		end
		if i < nums[2].to_i
			print " "
		end
	end 	
	puts
end