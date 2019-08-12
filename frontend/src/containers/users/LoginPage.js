import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import LoginComponent from '../../components/users/LoginComponent.js'

class LoginPage extends Component {
  constructor({props}){
    super(props);
    this.onUserSelected =  this.onUserSelected.bind(this)
  }
  onUserSelected(user){
    this.props.handleUserSelect(user)
  }
  render(){
    return (
      <div>
        <LoginComponent onUserSelected={this.props.handleUserSelect} users={this.props.users}/>
      </div>
    )
  }
}

export default LoginPage;
