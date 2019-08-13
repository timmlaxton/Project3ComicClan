import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import LoginComponent from '../../components/users/LoginComponent.js';
import NewUserForm from '../../components/users/NewUserForm.js';
import Request from '../../helpers/request';

class LoginPage extends Component {
  constructor(props){
    super(props);
    this.onUserSelected =  this.onUserSelected.bind(this)
    this.handleNewUserPost = this.handleNewUserPost.bind(this)
  }
  onUserSelected(user){
    this.props.handleUserSelect(user)
  }

  handleNewUserPost(newUser){
    const request = new Request();
    request.post('api/users', newUser)
    this.onUserSelected(newUser)

  }

  render(){
    return (
      <div>
        <LoginComponent onUserSelected={this.onUserSelected} users={this.props.users}/>
        <NewUserForm handleNewUserPost={this.handleNewUserPost}/>
      </div>
    )
  }
}

export default LoginPage;
