def solution(keymap, targets):    
    answer = []    
    for i in targets:        
        count = 0        
        for j in i:            
            min = 999            
            find = j            
            for k in keymap:                
                if min > k.find(find) >= 0:                    
                    min = k.find(find) + 1            
            count += min   
            if min == 999:
                count = -1
                break
        answer.append(count)    
    return answer