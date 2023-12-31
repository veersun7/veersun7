import axios from 'axios';

axios.interceptors.request.use( config => {
  const user = JSON.parse(localStorage.getItem('user'));

  if(user && user.accessToken){
    const token = 'Bearer ' + user.accessToken;
    config.headers.Authorization =  token;
    
  }

  return config;
});

class BackendService {
  async getUserBoard() {
    return await axios.get("/api/test/user");
  }


}

export default new BackendService();
