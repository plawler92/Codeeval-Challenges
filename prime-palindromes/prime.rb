def is_prime(num)
	prime = true
	for i in 2..num/2
		if num % i == 0
			prime = false
		end
		if prime == false
			break
		end
	end
	return prime
end

x = 1000
while x > 1
	if is_prime(x)
		y = x.to_s
		if y[0] == y[2]
			puts x
			break
		end
	end
	
	x = x-1
end
