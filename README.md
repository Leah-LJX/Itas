# Itas
Iterative program synthesis with code knowledge

## Overview
![image](https://github.com/user-attachments/assets/994c0cf2-b56c-42a2-b341-23a9a8f2eaef)


## Main Ideas
### Code Knowledge Search
The first component involves searching valuable knowledge from online sources, specifically the usage information of APIs relevant to the task at hand.
Recognizing the important role of Internet knowledge in programmers' development activities, we implemented a tool called Args, which uses a search engine to collect relevant API usage knowledge and assist in synthesis.  
Given a programming task query, Args processes it to extract a list of task-relevant APIs from online sources.
After filtering this list based on the user-provided API library, we obtain a subset of APIs that belong to the specified library, which are then used as components for program synthesis.

### Iterative Construction
The second component involves iteratively constructing the program space.
To further constrain the program space, we propose an incremental construction method. 
% Initially, we preprocess the API list returned by Args and categorize them to create API rankers. 
Initially, we categorize and rank the API list from Args to create API rankers.
Based on these rankers, we select a small subset of APIs as the initial set, which is then used to construct a preliminary program space. 
If the synthesizer successfully generates a program in the current space that passes all the test cases, the synthesis process terminates, returning the generated program. 
Otherwise, the program space is incrementally expanded by adding new APIs based on the rankers and selection strategy, trying to synthesize the program again. 
This iterative process continues until either a valid program is synthesized or the time limit is exceeded.

### Encapsulation
The third part involves the encapsulation of non-API elements.
To handle tasks that need to be solved using non-API elements, we heuristically propose a set of encapsulation grammar and create a custom non-API library.
When dealing with non-pure API tasks, we add the extraction of non-API elements when searching for knowledge. Then we encapsulate those non-API operations as standard APIs according to the encapsulation grammar. After that, we filter these API methods and non-API elements according to the custom non-API library and user-provided standard API library. At last, we perform a similar iterative synthesis process as described above to generate the desired program.

