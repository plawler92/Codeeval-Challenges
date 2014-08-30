def is_prime(num)
	for i in 2..num/2
		if num % i == 0
			return false
		end	
	end	
end

c = 0
x = 2
sum = 0
while c < 1000
	if is_prime(x)
		sum = sum + x
		c = c + 1
	end
	x = x + 1
end

puts sum
